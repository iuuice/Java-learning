package com.ice.day06;

public class Person {
    public int id;
    public String name;
    public int age;
    public String sex;

    public Person() {

    }
    public Person(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "+age]";
    }
}
