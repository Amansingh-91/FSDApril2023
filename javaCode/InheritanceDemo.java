package javaCode;
import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {     
        Dog tom =  new Dog();
        tom.age = 10;
        tom.color = "black";
        tom.breed = "Doberman";
        System.out.println(tom.d);
        tom.guard();
        tom.eat();
        tom.sleep();
        tom.provideColler(new DogColler("Tom","Aman Saini 123545678"));
        System.out.println(tom.d);        
    }
}
// constructor chainning :
// that parent class constructor will be called before initializing the instance variables of child class  
class Animal{
    // instance variables / properties
    String color;
    int age;
    String species;
    // private int p ;

    // functionality
    public Animal(){
        this.color = "red";
    }

    public Animal(String color, int age, String species) {
        this.color = color;
        this.age = age;
        this.species = species;
    }

    public void eat(){
        System.out.println("eating");
    }
    
    public void sleep(){
        System.out.println("sleeping");
    }
    

}

class Dog extends Animal{
    String breed;
    DogColler d;
    Dog(){
        super("Brown",12,"Pug");
    }
    
    public Dog(String color, int age, String species, String breed, DogColler d) {
        super(color, age, species);
        this.breed = breed;
        this.d = d;
    }

    public void guard(){
        System.out.println("guarding the area");
    }
    public void provideColler(DogColler d){
        this.d = d;
        
    } 
}

// DogColler IS A Dog 
// Dog Has A DogColler
class DogColler {
    String dog_name;
    String owner_details;
    public DogColler(String dog_name, String owner_details) {
        this.dog_name = dog_name;
        this.owner_details = owner_details;
    }

    @Override
    public String toString(){
        return ""+"Dog name:" + dog_name + " \nowner details :" + owner_details ; 
    }
    
}

 