package javaCode;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        // for loop
        // specific range / we for loop when we know exactly how many times we have to repeat some task 
        // for loop is also an entry point loop
        // syntax
        // for(declare starting point ; end condition ; inc/dec){ code block to repeated }

        // for(int i = 0; i < 5; i++ ){
        //     System.out.println("Enter your name");
        //     String name = sc.nextLine();

        //     System.out.printf("Hello %s , it's great to see you, How are you doing? \n",name);
        // }

        for (int i = 5; i > 0; i++) {
            System.out.println(i);
        }

        

        

        
    }
}
