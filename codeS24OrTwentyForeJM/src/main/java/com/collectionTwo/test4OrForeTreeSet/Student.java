package com.collectionTwo.test4OrForeTreeSet;

public class Student implements Comparable<Student> {

    // Comparable<Student> : Sort based on Student

    private String firstName;
    private String lastName;
    private int id;

    public Student() {
    }

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
