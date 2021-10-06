package com.practice;

public class Student {
    int rollNo;
    String firstName;
    String lastName;
    int deptId;
    String doj;
    String dob;
    Long mobileNo;
    String email;

    Student() {
    }

    public Student(int rollNo, String firstName, String lastName, int deptId, String doj, String dob, Long mobileNo, String email) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptId = deptId;
        this.doj = doj;
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", deptId='" + deptId + '\'' +
                ", doj='" + doj + '\'' +
                ", dob='" + dob + '\'' +
                ", mobileNo=" + mobileNo +
                ", email='" + email + '\'' +
                '}';
    }
}