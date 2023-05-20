package Folder2;
import javaCode.AccessModifiers;
public class Demo {
    public static void main(String[] args) {
        new Derived();
    }
}
class Base{
    Base(){
        System.out.println("base");
    }
}
class Derived extends Base{
    Derived(){
        
        this("Upgrad");
        System.out.println("derived");
    }
    Derived(String s){

        System.out.println(s);
    }
}