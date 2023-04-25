package javaCode;

public class AccessModifiers {
    // there are 4 access modfiers
    // public
    // private 
    // default
    // protected
    // use can use these access modifiers infront of class , function and variables
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        System.out.println(d1.x);
        System.out.println(d1.y);
        // System.out.println(d1.z);
    }
    
}

class Demo1{
    int x;
    public int y ;
    private int z;

}
