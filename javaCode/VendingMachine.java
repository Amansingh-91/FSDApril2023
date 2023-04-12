package javaCode;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // if else works based on conditions
        // if else works based on true/false which it gets from conditions
        // switch case works based on expression
        // switch case works based on some fixed value
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount");
        int amount = sc.nextInt();
        sc.nextLine();
        //  x = 5 and y = x
        // switch case
        switch (amount) {
            case 10:
                System.out.println("Please pick your chips");
                break;// jump statement
            case 15:
                System.out.println("Please pick your chocolate");
                break;
            default:
                System.out.println("invalid choice");
                
        }

    }
}
