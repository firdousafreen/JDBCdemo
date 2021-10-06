package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
public class DeleteStudents {

    static final String DB_URL = "jdbc:mysql://localhost:3306/demo1";
    static final String USER = "demo1";
    static final String PASS = "Muskan13";

    public int[] getRollNoFromFile (String fileName) throws FileNotFoundException {
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


            int[] rollNumbers = test.getRollNoFromFile("deletestudent.txt");
            for(int i=0;i<rollNumbers.length;i++){
                stmt.executeUpdate("delete from student where studentId="+rollNumbers[i]);

            }
            stmt.close();
            conn.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        }

    }

