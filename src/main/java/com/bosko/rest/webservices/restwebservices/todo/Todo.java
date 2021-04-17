package com.bosko.rest.webservices.restwebservices.todo;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name="todos")
public class Todo {

    @Id
    @GeneratedValue
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id")
    private Integer id;

//    @Column(name="username")
    private String username;

//    @Column(name="description")
    private String description;

//    @Column(name="target_date")
    private Date targetDate;

//    @Column(name="is_done")
    private boolean isDone;

    protected Todo() {

    }

    public Todo(int id, String username, String description, Date targetDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
