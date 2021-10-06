/*
package com.practice;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class NewStudent {
    public static void main(String[] args) throws IOException {
        FileReader Fr = new FileReader("newInput.txt");
        Scanner sc = new Scanner(Fr);

//      For reading the number of lines in the file
        Path path = Paths.get("newInput.txt");
        long numberOfLines = Files.lines(path).count();

        Student[] students = new Student[(int) numberOfLines];
        for (int i = 0; sc.hasNextLine(); i++) {
            int rollNo = parseInt(sc.next());
            String firstName = (sc.next());
            String lastName = (sc.next());
            int deptId = parseInt(sc.next());
            String doj = (sc.next());
            String dob = (sc.next());
            Long mobileNo = parseLong(sc.next());
            String email = (sc.next());

            Student student = new Student(rollNo, firstName, lastName, deptId, doj, dob, mobileNo, email);
            students[i] = student;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }


    }
}

*/
