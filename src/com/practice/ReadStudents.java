package com.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class ReadStudents {
    public static void main(String[] args) throws IOException {
        FileReader Fr = new FileReader("input.txt");
        Scanner sc = new Scanner(Fr);

        Student[] students = new Student[3];
        for (int i = 0; sc.hasNextLine(); i++) {
            int rollNo = parseInt(sc.next());
            String firstName = (sc.next());
            String lastName = (sc.next());
            int dept = parseInt(sc.next());
            String doj = (sc.next());
            String dob = (sc.next());
            Long mobileNo = parseLong(sc.next());
            String email = (sc.next());

            Student student = new Student(rollNo, firstName, lastName, dept, doj, dob, mobileNo, email);
            students[i] = student;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }



    }
}
