package com.joelr.swetransfercredits.dao;

import com.joelr.swetransfercredits.model.Course;

import java.util.List;

public interface CourseDao {
    List<Course> getCourses();
    Course updateAttending(Course course, Boolean attending);
    Course updateCompleted(Course course, Boolean completed);
}