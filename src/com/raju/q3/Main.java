package com.raju.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll No:");
        int rollNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student name:");
        String studentName = sc.nextLine();
        System.out.println("Enter marks:");
        int marks = Integer.parseInt(sc.nextLine());
        Student student = new Student(rollNumber, studentName, marks);
        System.out.println("Your filled details");
        System.out.println("Roll NO. -->  "+student.getRollNumber());
        System.out.println("Student Name -->  "+student.getStudentName());
        System.out.println("Marks -->  "+student.getMarks());
    }
}
class Student {
    private int rollNumber;
    private String studentName;
    private int marks;
    public Student() {
    }

    public Student(int rollNumber, String studentName, int marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}