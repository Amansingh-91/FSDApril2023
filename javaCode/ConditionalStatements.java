package javaCode;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter your name");
        // String name = sc.next();// takes only single word of the input
        // sc.nextLine();
        String name = sc.nextLine(); // takes complete sentence as input
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        // System.out.println("your name is "+name+" your age is "+ age +" and you are eligible");

        // System.out.printf("your name is %s your age is %d and you are eligible \n",name,age);


        if(age >= 18){
            System.out.println("eligible for DL");
        }
        // else{
        //     if(age == 17){
        //         System.out.println("eligible for learning DL");
        //     }
        //     else{
        //         System.out.println("not eligible");
        //     }
        // }
        else if(age == 17){
            System.out.println("eligible for learning DL");
        }
        else{
            System.out.println("not eligible");
        }
        


    }
}
