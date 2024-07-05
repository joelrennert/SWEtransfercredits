package com.joelr.swetransfercredits.service;

import com.joelr.swetransfercredits.dao.JdbcCourseDao;
import com.joelr.swetransfercredits.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseService {

    @Autowired
    private JdbcCourseDao courseDao;

    public List<Course> getCourses() {
        return courseDao.getCourses();
    }

    public Course updateCompleted(Course course, int id) {
        // Assuming course object already has updated completion status
        return courseDao.updateCompleted(course, course.isCompleted());
    }

    public Course updateAttending(Course course, int id) {
        // Assuming course object already has updated attending status
        return courseDao.updateAttending(course, course.isAttending());
    }
}