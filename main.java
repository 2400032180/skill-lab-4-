package com.klu;

class Course {

    private String courseName;
    private int duration;

    // Constructor Injection
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String toString() {
        return courseName + " (" + duration + " months)";
    }
}

class Student {

    private int studentId;
    private String name;
    private int year;
    private Course course;
    private String email;
    private String phoneNumber;

    // Constructor Injection
    public Student(int studentId, String name, int year) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
    }

    // Setter Injection
    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Student ID      : " + studentId);
        System.out.println("Student Name    : " + name);
        System.out.println("Academic Year   : " + year);
        System.out.println("Email           : " + email);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println("Course          : " + course);
    }
}

public class App {

    public static void main(String[] args) {

        // Constructor Injection
        Course course = new Course("Spring Framework", 6);
        Student student = new Student(101, "Ram", 2026);

        // Setter Injection
        student.setCourse(course);
        student.setEmail("ram@klu.edu");
        student.setPhoneNumber("9876543210");

        student.display();
    }
}