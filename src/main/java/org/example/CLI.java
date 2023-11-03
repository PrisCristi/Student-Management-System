package org.example;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while(true) {
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

                    if (option == 1) {
                        System.out.println("User created.");
                    } else if (option == 2) {
                        System.out.println("User updated.");
                    } else if (option == 3) {
                        System.out.println("User deleted.");
                        break;
                    } else {
                        System.out.println("Invalid action. Please select a valid option.");
                    }
                }

                scanner.close();
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

                    if (option == 1) {
                        System.out.println("You selected 'Add Student'.");

                    } else if (option == 2) {
                        System.out.println("You selected 'Update Student'.");
                        // Adicione o código para atualizar um aluno aqui.
                    } else if (option == 3) {
                        System.out.println("You selected 'Delete Student'.");
                        break;
                    } else {
                        System.out.println("Invalid action. Please select a valid option.");
                    }
                }

                scanner.close();
            }
        }


