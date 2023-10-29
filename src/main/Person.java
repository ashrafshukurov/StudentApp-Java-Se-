package main;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surName;
    private int age;
    private Integer id;
    private LocalDate birthdate;
    private LocalDate admissionDate;
    private static Integer staticId = 12;
    private double score;
    public Person(){

    }

    public Person(String name, String surName, int age, double score, LocalDate birthdate, LocalDate admissionDate) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.id = staticId;
        this.birthdate = birthdate;
        this.admissionDate = admissionDate;
        this.score = score;
        staticId += 2;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public static void setStaticId(Integer staticId) {
        Person.staticId = staticId;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}