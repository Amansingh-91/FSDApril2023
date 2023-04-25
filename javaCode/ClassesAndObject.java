package javaCode;

public class ClassesAndObject {
    // classes are logical entity
    // classes are blueprint
    // objects are instance of a class
    // objects are physical entity
    public static void main(String[] args) {
        int x = 12;// local variable 
        // local variable have block scope
        // local variable doesn't have default

        if(x == 12){
            int y = 10; // local variable
            System.out.println("inside if");
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println("outside if");
        System.out.println(x);
        // System.out.println(y); outside scope

        Student s1 = new Student("Aman",19);
        Student s2 = new Student();

        // s1.name = "Aman";
        // s1.rollNo = 1;
        s1.numberOfStudents = 1;

        s2.name = "Divya";
        s2.rollNo = 2;
        s2.numberOfStudents = 10;

        Student.numberOfStudents = 20;

        System.out.println(s2.name + " "+ s2.rollNo);
        System.out.println(s1.name + " "+ s1.rollNo);
        System.out.println(s1.numberOfStudents);

        
    }

}

class Student{
    // instance variable 
    // variables created inside class but outside any function
    // object scope
    //  have default values
    // with each object seperate copies of these variables were created
    int rollNo; // 0
    String name; // null

    // static variable / class variable
    // variables created inside class but outside any function with static keyword
    // class scope
    // for complete class this variable will allocated only once

    static int numberOfStudents;

    // Constructor
    // special functions in java which have same name as class name and no return type
    // used to initialize the value of instance variable
    
    // default constructor
    // default constructor is created by by your compiler if you don't create any constructor 
    public Student(){
        this.name = "baba yaga";
        this.rollNo = 7;
    }

    // parameterized constructor
    public Student( String name,int r){
        this.name = name;
        this.rollNo = r;
    }





}
