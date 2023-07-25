package com.Spring_Boot.CRUD_RestAPI_MYSQL.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring_Boot.CRUD_RestAPI_MYSQL.dao.SubjectDao;
import com.Spring_Boot.CRUD_RestAPI_MYSQL.entities.Subject;
import com.Spring_Boot.CRUD_RestAPI_MYSQL.exception.ResourceNotFoundException;

@Service
public class SubjectServiceImpl implements SubjectServices {

    private final SubjectDao courseDao;//

    @Autowired
    public SubjectServiceImpl(SubjectDao subjectRepository) {
        this.courseDao = subjectRepository;
    }

    @Override
    public List<Subject> getCourse() {
        return courseDao.findAll();
    }

    @Override
    public Subject getCourse(long courseId) {
        Optional<Subject> optionalSubject = courseDao.findById(courseId);
        return optionalSubject
                .orElseThrow(() -> new ResourceNotFoundException("Subject not found with id: " + courseId));
    }

    @Override
    public Subject addCourse(Subject course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Subject updateCourse(Subject course) {
        courseDao.save(course);//
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Subject entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }

}
