package javaCode;
public class UserDefinedException extends Exception {
    public UserDefinedException(String myexp){
        super(myexp);
    }


}
class Atm{
    int balance;
    Atm(int balance){
        this.balance = balance;
    }
    public void withdraw(int amt) throws UserDefinedException{
        if(balance < amt){
            throw new UserDefinedException("No Money in Atm");
        }
        else{
            balance -= amt;
            System.out.println("please take your amount");
        }
    }
}

abstract class Animal{
    abstract public void speak();
}
class dog extends Animal   {
    public void speak(){
        System.out.println("barks");
    }
}

class cat extends Animal   {
    public void speak(){
        System.out.println("meow");
    }
}

// class lion extends Animal{
    
// }