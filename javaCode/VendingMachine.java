package javaCode;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // if else works based on conditions
        // if else works based on true/false which it gets from conditions
        // switch case works based on expression
        // switch case works based on some fixed value
        Scanner sc = new Scanner(System.in);
        // starting point
        char ch = 'n';

        do {
            System.out.println("Menu \n1. chips  Rs10 \n2. chocolate  Rs15 \n3. coke  Rs20 \n4. kitkat  Rs25");

            System.out.println("enter the amount");
            int amount = sc.nextInt();
            sc.nextLine();
            // x = 5 and y = x
            // switch case
            switch (amount) {
                case 10:
                    System.out.println("Please pick your chips");
                    // jump statement
                case 15:
                    System.out.println("Please pick your chocolate");
                    break;
                case 20:
                    System.out.println("Please pick your coke");
                    break;// jump statement
                case 25:
                    System.out.println("Please pick your kitkat");
                    break;
                default:
                    System.out.println("invalid choice, please collect your money ");

            }

            // inc/dec
            System.out.println("do  you wish to make another purchase? if yes press y else n");
            ch = sc.nextLine().charAt(0);
        } while (ch == 'y');

    }
}
