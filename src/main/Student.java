package main;

import java.time.LocalDate;

public class Student extends Person implements Comparable<Student> {
    public Student(String name, String surName, int age, double score, LocalDate birthdate, LocalDate admissionDate) {
        super(name, surName, age, score, birthdate, admissionDate);

    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }

    public void printStudentInfo() {
        System.out.println("Name: " + getName() + " Surname: " + getSurName() + " Age: " + getAge()
                + " Id: " + getId() + " BirthDate: " + getBirthdate() + " AdmissionDate: " + getAdmissionDate());
    }


}
