package com.Spring_Boot.CRUD_RestAPI_MYSQL.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Spring_Boot.CRUD_RestAPI_MYSQL.entities.Subject;
import com.Spring_Boot.CRUD_RestAPI_MYSQL.services.SubjectServices;

@RestController
public class MyController {
    @Autowired
    private SubjectServices courseService;

    @GetMapping("/home")
    public String home() {
        return "home application";
    }

    // get course
    @GetMapping("/courses")
    public List<Subject> getCourses() {
        return this.courseService.getCourse();
    }

    //
    @GetMapping("/courses/{courseId}")
    public Subject getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Subject addCourse(@RequestBody Subject course) {
        return this.courseService.addCourse(course);
    }

    // update course using PUT request
    @PutMapping("/courses")
    public Subject updateCourse(@RequestBody Subject course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
