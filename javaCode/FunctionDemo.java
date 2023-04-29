package javaCode;

import java.util.Scanner;
public class FunctionDemo {
    // Syntax of function
    // access_Modifiers nonAccess_Modifier[optional] Return_Type function_Name(Parameters[optional]){ code block}
    // function without parameters
    public void greet(){
        System.out.println("Hello Friends");
    }

    // function with parameters
    public void greetWithName(String name){
        System.out.println("hi "+ name);
    }

    public void payment(int amount){
        
        System.out.printf("utility bill paid for amount %d successfully",amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the name of the person you wish to greet");
        // String name =  sc.nextLine();
        // object creation
        // class_name obj_name =  new class_Name();
        FunctionDemo obj = new FunctionDemo();
        obj.greet();
        System.out.println("enter the amount to be paid");
        int amount = sc.nextInt();
        sc.nextLine();
        obj.payment(amount);
        
    }
}

class Example{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person you wish to greet");
        String name =  sc.nextLine();
        // System.out.println("Hello  "+name);
        FunctionDemo obj = new FunctionDemo();
        obj.greet();
        obj.greetWithName(name);

        obj.payment(1000);

        
    }
}
