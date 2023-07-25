package com.Spring_Boot.CRUD_RestAPI_MYSQL.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String topic;
    private String description;

    public Subject() {
        super();
    }

    public Subject(long id, String topic, String description) {
        this.id = id;
        this.topic = topic;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Subject [id=" + id + ", topic=" + topic + ", description=" + description + "]";
    }

}
