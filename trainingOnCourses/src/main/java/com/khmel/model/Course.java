package com.khmel.model;

public class Course {
    private int id;
    private int idPrice;
    private String name;
    private String type;
    private int countOfDays;
    private int countOfTrainees;

    public Course() { }

    public Course(int id, int idPrice, String name,
                  String type, int countOfDays, int countOfTrainees) {
        this.id = id;
        this.idPrice = idPrice;
        this.name = name;
        this.type = type;
        this.countOfDays = countOfDays;
        this.countOfTrainees = countOfTrainees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public int getCountOfTrainees() {
        return countOfTrainees;
    }

    public void setCountOfTrainees(int countOfTrainees) {
        this.countOfTrainees = countOfTrainees;
    }
}