package com.ice.homework;

public class Company {
    private int id;
    private String name;
    private String boss;
    private  int year;
    public Company(int id, String name, String boss, int year) {

        this.id = id;
        this.name = name;
        this.boss = boss;
        this.year = year;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBoss() {
        return boss;
    }
    public void setBoss(String boss) {
        this.boss = boss;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Company [id=" + id + ", name=" + name + ", boss=" + boss + ", year=" + year + "]";
    }
}
