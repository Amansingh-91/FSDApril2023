package javaCode;

public class BillsBurger{
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
hamburger.addHamburgerAddition1("Tomato", 0.27);
hamburger.addHamburgerAddition2("Lettuce", 0.75);
hamburger.addHamburgerAddition3("Cheese", 1.13);
System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
 
HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
healthyBurger.addHamburgerAddition1("Egg", 5.43);
healthyBurger.addHealthyAddition1("Lentils", 3.41);
System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
 
DeluxeBurger db = new DeluxeBurger();
db.addHamburgerAddition3("Should not do this", 50.53);
System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}


class Hamburger{

    // name, meat, price, and breadRollType
    String name;
    String meat;
    String breadRollType;
    double price;
    public Hamburger(String name, String meat,  double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    } 
    // addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, and addition4Price.
    String addition1Name;
    double addition1Price;

    String addition2Name;
    double addition2Price;

    String addition3Name;
    double addition3Price;

    String addition4Name;
    double addition4Price;

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    // Basic hamburger on a White roll with Sausage, price is 3.56
// Added Tomato for an extra 0.27
// Added Lettuce for an extra 0.75
// Added Cheese for an extra 1.13
// Total Burger price is 5.71
    public double itemizeHamburger(){
        double totalprice= this.price;
        System.out.printf("%s hamburger on a %s roll with %s, price is %1.2f\n",name,breadRollType,meat,price);
        if(this.addition1Name != null){
            System.out.println("Added "+ addition1Name +" for an extra price "+addition1Price );
            totalprice += addition1Price;
        }
        if(this.addition2Name != null){
            System.out.println("Added "+ addition2Name +" for an extra price "+addition2Price );
            totalprice += addition2Price;
        }

        if(this.addition3Name != null){
            System.out.println("Added "+ addition3Name +" for an extra price "+addition3Price );
            totalprice += addition3Price;
        }
        if(this.addition4Name != null){
            System.out.println("Added "+ addition4Name +" for an extra price "+addition4Price );
            totalprice += addition4Price;
        }
        // System.out.println("Total Burger price is "+totalprice);
        return totalprice;
    }


}
class DeluxeBurger extends Hamburger{
    // Cannot not add additional items to a deluxe burger
// Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54
// Added Chips for an extra 2.75
// Added Drink for an extra 1.81
// Total Deluxe Burger price is 19.10

    public DeluxeBurger(){
        super("Delux", "Sausage & Bacon", 14.54,"White");

    }
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    public double itemizeHamburger(){
        
        System.out.printf("%s hamburger on a %s roll with %s, price is %1.2f\nAdded Chips for an extra 2.75\nAdded Drink for an extra 1.81\n",name,breadRollType,meat,price);
        
        // System.out.println("Total Burger price is "+19.10);
        return 19.10;
    }
}

class HealthyBurger extends Hamburger{
    // healthyExtra1Name, healthyExtra1Price
    String healthyExtra1Name;
    double healthyExtra1Price;
    String healthyExtra2Name;
    double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "White");
    }
    // addHealthyAddition1 and addHealthyAddition2
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    // Healthy hamburger on a Brown rye roll with Bacon, price is 5.67
// Added Egg for an extra 5.43
// Added Lentils for an extra 3.41
// Total Healthy Burger price is  14.51
    
public double itemizeHamburger(){
    double totalprice= this.price;
    System.out.printf("%s hamburger on a %s roll with %s, price is %1.2f\n",name,breadRollType,meat,price);
    if(this.addition1Name != null){
        System.out.println("Added "+ addition1Name +" for an extra price "+addition1Price );
        totalprice += addition1Price;
    }
    if(this.addition2Name != null){
        System.out.println("Added "+ addition2Name +" for an extra price "+addition2Price );
        totalprice += addition2Price;
    }

    if(this.addition3Name != null){
        System.out.println("Added "+ addition3Name +" for an extra price "+addition3Price );
        totalprice += addition3Price;
    }
    if(this.addition4Name != null){
        System.out.println("Added "+ addition4Name +" for an extra price "+addition4Price );
        totalprice += addition4Price;
    }
    if(this.healthyExtra1Name != null){
        System.out.println("Added "+ healthyExtra1Name +" for an extra price "+healthyExtra1Price );
        totalprice += healthyExtra1Price;
    }
    if(this.healthyExtra2Name != null){
        System.out.println("Added "+ healthyExtra2Name +" for an extra price "+healthyExtra2Price );
        totalprice += healthyExtra2Price;
    }
    // System.out.println("Total Burger price is "+totalprice);
    return totalprice;
}
    
}