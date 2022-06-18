package com.company;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String department = in.next();

    /*    switch (empid) {
            case 1:
                System.out.println("Tushar Kant");
                break;
            case 2:
                System.out.println("Akshay Lende");
                break;
            case 3:
                System.out.println("Anuj Mehere");
                break;
            case 4:
                System.out.println("Thia is empid 4");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Electronics":
                        System.out.println("Electronics department");
                        break;
                    case "Computer":
                        System.out.println("Computer Department");
                        break;
                    default:
                        System.out.println("Please select a valid department");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct empid");
                break;
        }
    }
}*/


// Better waay to write

        switch (empid) {
            case 1 -> System.out.println("Tushar Kant");
            case 2 -> System.out.println("Akshay Lende");
            case 3 -> System.out.println("Anuj Mehere");
            case 4 -> {
                System.out.println("Thia is empid 4");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Electronics" -> System.out.println("Electronics department");
                    case "Computer" -> System.out.println("Computer Department");
                    default -> System.out.println("Please select a valid department");
                }
            }
            default -> System.out.println("Enter correct empid");
        }
    }
}