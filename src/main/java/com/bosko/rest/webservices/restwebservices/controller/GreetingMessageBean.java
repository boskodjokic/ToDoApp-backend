package com.bosko.rest.webservices.restwebservices.controller;

public class GreetingMessageBean {

    private String message;

    public GreetingMessageBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "GreetingMessageBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
