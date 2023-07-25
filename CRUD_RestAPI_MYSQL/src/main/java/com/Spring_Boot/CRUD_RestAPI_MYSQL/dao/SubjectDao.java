package com.Spring_Boot.CRUD_RestAPI_MYSQL.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring_Boot.CRUD_RestAPI_MYSQL.entities.Subject;

public interface SubjectDao extends JpaRepository<Subject, Long> {

}