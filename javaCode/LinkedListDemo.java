package javaCode;

import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Aman");
        names.add("Divya");
        names.add("Dharam");
        names.add("jhon");
        names.add("jack");
        names.add("jasmine");
        System.out.println(names);
        // for each loop
        // for(data_type var : iterable){}
        
        for (String name : names) {
            // System.out.println(name);
            if(name.equals("jhon")){
                System.out.println(name +" found");
            }
            
        }
        // using iterator class
        System.out.println("using iterator");

        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
