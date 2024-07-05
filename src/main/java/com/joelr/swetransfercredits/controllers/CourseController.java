package com.joelr.swetransfercredits.controllers;

import com.joelr.swetransfercredits.model.Course;
import com.joelr.swetransfercredits.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(path = "/wguswetransfercredits")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get all courses
    @GetMapping
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    // Update completed status
    @PutMapping("/{id}/completed")
    public Course updateCompleted(@PathVariable int id, @RequestBody Course course) {
        return courseService.updateCompleted(course, id);
    }

    // Update attending status
    @PutMapping("/{id}/attending")
    public Course updateAttending(@PathVariable int id, @RequestBody Course course) {
        return courseService.updateAttending(course, id);
    }
}