package com.mycompany.node.demo.demooao.asdadasd.tree.treeee.bubble.sinhvien.student;

public class Student {

    private int studentId;
    private String fullName;
    private double marks;
    private String rank;

    public Student(int studentId, String fullName, double marks) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.marks = marks;
        this.rank = calculateRank(marks);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        this.rank = calculateRank(marks);
    }

    public String getRank() {
        return rank;
    }

    private String calculateRank(double marks) {
        if (marks < 5.0) {
            return "Fail";
        } else if (marks < 7.0) {
            return "Pass";
        } else {
            return "Distinction";
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Full Name: " + fullName + ", Marks: " + marks + ", Rank: " + rank;
    }
}
