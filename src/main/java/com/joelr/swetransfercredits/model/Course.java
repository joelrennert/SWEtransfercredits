package com.joelr.swetransfercredits.model;

public class Course {

    private int id;
    private String courseId;
    private String name;
    private int creditHours;
    private boolean attending;
    private boolean completed;


    public Course(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public boolean isAttending() {
        return attending;
    }

    public void setAttending(boolean attending) {
        this.attending = attending;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    @Override
    public String toString(){
        return "Course{" +
                ", id = " + id +
                ", course id = " + courseId +
                ", name = " + name +
                ", credit hours = " + creditHours +
                ", completed = " + completed + "}";
    }


}
