package javaCode;
import java.util.Scanner;

public class VariableAndDataTypeDemo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        byte b = 127;// -128 to 127
        short s = b;
        byte c = (byte) s;
        System.out.println(c);
        s = -130;// updating
        c = (byte)s;
        System.out.println(c);

        //  byte  < short < int <long < float < double

        // Operators in java
        // Airthematic operator
        // +,-, *, /, %, ++, --
        System.out.println(10 + 12);// 22
        System.out.println(10.0 + 12);// 22.0
        System.out.println(10 - 12);// -2
        System.out.println(10 * 12);
        System.out.println(12 / 4);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);// / provides quotient
        System.out.println(5 % 2);// % provides remainder

        
        System.out.println("Enter the number");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the name");
        String name = sc.nextLine();
        



    }
}
