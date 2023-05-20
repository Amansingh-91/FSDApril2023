package javaCode;

public class Poymorphism {
    // method overloading And method overriding
    // method overloading/compile time polymorphism is creating multiple functions with same name and different number of parameters or different type of parameters
    public static void main(String[] args) {
        // Volume v =  new Volume();
        // v.area(5);
        
        // System.out.println(3.0/0);
        // System.out.println(0.0/ 3);
        // System.out.println(0.0/0);

    }


}

class Area{
    
    // Square area
    public int area(int side){
        return side * side;
    }
    // circle area
    public double area(double radius){
        return 3.14 * radius * radius ;
    }
    // rectangle area 
    public float area(float l , int b){
        return l * b;
    }
    // triangle area
    public double area(int base ,float height){
        return 0.5 * base * height;
    }
}
class Volume extends Area{
    @Override
    public int area(int side){
        // super.area(side);
        
        return side * side * side;
        
    }

    public int area(double d ,double c){
        return 10;
    }
}

class CarBase{
    public void cruizeControl(){
        System.out.println("does not have cruize control");
    }
}
class CarTop extends CarBase{
    public void cruizeControl(){
        System.out.println("Have cruize control");
    }
}