package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class AddStudents {
    static final String DB_URL = "jdbc:mysql://localhost:3306/demo1";
    static final String USER = "demo1";
    static final String PASS = "Muskan13";

    public Student[] getStudentsFromFile(String fileName) throws IOException {
        FileReader Fr = new FileReader(fileName);
        Scanner sc = new Scanner(Fr);


//      For reading the number of lines in the file
        Path path = Paths.get(fileName);
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

        return students;
    }

    public int[] getRollNoFromFile(String fileName) throws FileNotFoundException {
        FileReader Fr = new FileReader(fileName);
        Scanner sc = new Scanner(Fr);
        int[] rollNumbers = new int[2];
        for (int i = 0; i < rollNumbers.length; i++) {
            rollNumbers[i] = parseInt(sc.next());

        }
        return rollNumbers;
    }

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            AddStudents test = new AddStudents();
            Student[] students = test.getStudentsFromFile("newInput.txt");
            for (int i = 0; i < students.length; i++) {
                stmt.executeUpdate("INSERT INTO Student " +
                        "VALUES (" +
                        students[i].getRollNo() + "," +
                        '\'' + students[i].getFirstName() + "'," +
                        '\'' + students[i].getLastName() + "'," +
                        students[i].getDeptId() + "," +
                        "STR_TO_DATE('" + students[i].getDoj() + "','%d/%m/%Y'), " +
                        "STR_TO_DATE('" + students[i].getDob() + "','%d/%m/%Y'), " +
                        students[i].getMobileNo() + "," +
                        '\'' + students[i].getEmail() + '\'' +
                        ")"
                );
            }
			
            stmt.close();
            conn.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}


