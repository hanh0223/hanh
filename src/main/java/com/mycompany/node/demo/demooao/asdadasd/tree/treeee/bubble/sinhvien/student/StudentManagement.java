package com.mycompany.node.demo.demooao.asdadasd.tree.treeee.bubble.sinhvien.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class StudentManagement {

    private List<Student> students;
    private Set<Integer> studentIds;
    private Scanner scanner;

    public StudentManagement() {
        this.students = new ArrayList<>();
        this.studentIds = new HashSet<>();
        this.scanner = new Scanner(System.in);
    }

    private double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    private int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
            }
        }
    }

    public void addStudent() {
        int studentId = studentIds.isEmpty() ? 1 : studentIds.stream().max(Integer::compare).get() + 1;

        System.out.print("Enter Student Full Name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("Enter Student Marks: ");
        double marks = readDouble();

        Student student = new Student(studentId, fullName, marks);
        students.add(student);
        studentIds.add(studentId);
        System.out.println("Student added successfully!");
    }

    public void editStudent() {
        System.out.print("Enter Student ID to edit: ");
        int studentId = readInt();

        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                System.out.print("Enter new Full Name: ");
                String fullName = scanner.nextLine().trim();
                student.setFullName(fullName);

                System.out.print("Enter new Marks: ");
                double marks = readDouble();
                student.setMarks(marks);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int studentId = readInt();

        students.removeIf(student -> student.getStudentId() == studentId);
        studentIds.remove(studentId);

        System.out.println("Student deleted successfully!");
    }

    public void sortStudents() {
        if (students.size() < 2) {
            System.out.println("No need to sort, insufficient number of students.");
            return;
        }

        students.sort((s1, s2) -> Double.compare(s1.getMarks(), s2.getMarks()));
        System.out.println("Students sorted by marks!");
    }

    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int studentId = readInt();

        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Displaying all students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
