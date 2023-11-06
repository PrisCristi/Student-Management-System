package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("1. User Management");
            System.out.println("2. Student Management");

            System.out.println("Enter with your option: ");
            option = scanner.nextInt();

            if (option == 1) {
                userManagementMenu();
            } else if (option == 2) {
                studentManagementMenu();
                break;
            } else {
                System.out.println("Invalid action. Please select a valid option.");
            }
        }
        scanner.close();
    }

    public static void userManagementMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("1. Create User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");

            System.out.print("Enter with your option ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("User created.");
                    break;
                case 2:
                    System.out.println("User updated.");
                    break;
                case 3:
                    System.out.println("User deleted.");
                    break;
                default:
                    System.out.println("Invalid action. Please select a valid option.");
            }
            scanner.close();
        }
    }

    public static void studentManagementMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");

            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("You selected 'Add Student'.");
                    break;
                case 2:
                    System.out.println("You selected 'Update Student'.");
                    break;
                case 3:
                    System.out.println("You selected 'Delete Student'.");
                    break;
                default:
                    System.out.println("Invalid action. Please select a valid option.");
            }
            scanner.close();
        }
    }
}


