package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = new ArrayList<Student>();


        studentList.sort(Comparator
                .comparing(Student::getCgpa)
                .reversed()
                .thenComparing(Student::getFname)
                .thenComparing(Student::getId)
        );

        studentList.sort((c1, c2) -> c1.getFname().compareTo(c2.getFname()));

    }

}




