package javaCode;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Customer aman = new Customer("Aman Saini", 1000, "123456789");
        int amount = aman.getAmount();
        System.out.println(amount);
        amount = 150;
        System.out.println(amount);
        System.out.println(aman.getAmount());

        
    }
}

class Customer{
    private String name;
    private int amount;
    private String accountNumber;

    public int getAmount(){
        return this.amount;
    }
    public void changeAmount(int amount){
        this.amount = amount;
    }
    public Customer(String name, int amount, String accountNumber) {
        this.name = name;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }
    

    

}
