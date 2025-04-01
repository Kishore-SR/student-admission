package com.devops;

import java.util.Scanner;

public class StudentAdmissionCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Student Admission System!");
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        
        System.out.println("\nStudent Admission Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        scanner.close();
    }
}
