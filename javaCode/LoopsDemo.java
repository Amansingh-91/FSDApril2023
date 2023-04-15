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

        // for(int i = 5; i < 10; i++ ){
        //     System.out.println("Enter your name");
        //     String name = sc.nextLine();

        //     System.out.printf("Hello %s , it's great to see you, How are you doing? \n",name);
        // }

        // for (int i = 30; i > 0; i = i-3) {
        //     System.out.println(i);
        // }

        // while loop
        // we use for loop when we know that task is to be repeated but we are not sure for how many time
        // 
        // syntax
        // starting point
        // while(conditions){
            // code block;
            // inc/dec;
        // }
        // char ch = 'y';
        // while(ch == 'y'){
        //     System.out.println("hello friends in while");
        //     System.out.println("do you want to continue");
        //     ch = sc.nextLine().charAt(0);
            
        // }

        // String ch = "yes";
        // while(ch.equals("yes")){
        //     System.out.println("hello friends");
        //     System.out.println("do you want to continue");
        //     ch = sc.nextLine();

        // }

        // Do while loop
        // when atleast once we have to repeat the task
        // Syntax 
        // starting point
        // do{
            // code block
           
            // inc/dec
        // }while(condition);
        char ch ='n';
        do{
            System.out.println("hello friends in do while");
            ch = sc.nextLine().charAt(0);
        }while(ch == 'y');
        

        

        
    }
}
