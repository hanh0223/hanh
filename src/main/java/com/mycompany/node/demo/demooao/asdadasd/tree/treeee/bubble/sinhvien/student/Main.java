package com.mycompany.node.demo.demooao.asdadasd.tree.treeee.bubble.sinhvien.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students by Marks");
            System.out.println("5. Search Student by ID");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                continue;
            }

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.editStudent();
                    break;
                case 3:
                    sm.deleteStudent();
                    break;
                case 4:
                    sm.sortStudents();
                    break;
                case 5:
                    sm.searchStudent();
                    break;
                case 6:
                    sm.displayAllStudents();
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    sm.closeScanner();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }
}
