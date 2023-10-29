package operation;

import main.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class Add {
    public static Student fillStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter surName");
        String surName = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter score");
        double score = sc.nextDouble();
        System.out.println("Enter birthDate,Year,Month and day");
        LocalDate localDate = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter AdmissionDate Year,Month and day");
        LocalDate localDate1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        return new Student(name, surName, age, score, localDate, localDate1);
    }
}
