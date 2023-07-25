package com.Spring_Boot.CRUD_RestAPI_MYSQL.services;

import java.util.List;
import com.Spring_Boot.CRUD_RestAPI_MYSQL.entities.Subject;

public interface SubjectServices {

    public List<Subject> getCourse();

    public Subject getCourse(long id);

    public Subject addCourse(Subject course);

    public Subject updateCourse(Subject course);

    public void deleteCourse(long parselong);

}
