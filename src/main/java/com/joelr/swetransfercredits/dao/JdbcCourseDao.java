package com.joelr.swetransfercredits.dao;

import com.joelr.swetransfercredits.model.Course;
import com.joelr.swetransfercredits.exception.DaoException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCourseDao implements CourseDao {

    private final String COURSE_SELECT = "SELECT c.id, c.course_id, c.name, c.credit_hours, c.attending, c.completed FROM courses c";
    private final JdbcTemplate jdbcTemplate;

    public JdbcCourseDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // Get all courses
    @Override
    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        String sql = COURSE_SELECT;
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while (results.next()) {
                courses.add(mapRowToCourse(results));
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        } catch (DataIntegrityViolationException e) {
            throw new DaoException("Data integrity violation", e);
        }
        return courses;
    }

    // Get course by ID
    public Course getCourseById(int id) {
        String sql = COURSE_SELECT + " WHERE c.id = ?";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
            if (results.next()) {
                return mapRowToCourse(results);
            } else {
                throw new DaoException("Course with ID " + id + " not found");
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        } catch (DataIntegrityViolationException e) {
            throw new DaoException("Data integrity violation", e);
        }
    }

    // Update attending status
    public Course updateAttending(Course course, Boolean attending) {
        String sql = "UPDATE courses SET attending = ? WHERE id = ?";
        try {
            jdbcTemplate.update(sql, attending, course.getId());
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        } catch (DataIntegrityViolationException e) {
            throw new DaoException("Data integrity violation", e);
        }
        course.setAttending(attending); // Update the local object state
        return course;
    }

    // Update completed status
    public Course updateCompleted(Course course, Boolean completed) {
        String sql = "UPDATE courses SET completed = ? WHERE id = ?";
        try {
            jdbcTemplate.update(sql, completed, course.getId());
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        } catch (DataIntegrityViolationException e) {
            throw new DaoException("Data integrity violation", e);
        }
        course.setCompleted(completed); // Update the local object state
        return course;
    }

    private Course mapRowToCourse(SqlRowSet results) {
        Course course = new Course();
        course.setId(results.getInt("id"));
        course.setCourseId(results.getString("course_id"));
        course.setName(results.getString("name"));
        course.setCreditHours(results.getInt("credit_hours"));
        course.setCompleted(results.getBoolean("completed"));
        course.setAttending(results.getBoolean("attending"));
        return course;
    }
}