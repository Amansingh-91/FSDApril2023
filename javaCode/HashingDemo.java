package javaCode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class HashingDemo {
    // (1,2,3 ) (3,2,1) (3,1,2) order is not preserved
    // (1,2,3) (3,4) = (1,2,3,4) duplicate are not allowed
    // set + hashing  = hashset
    // map + hassing  = hashmap
    
    
    public static void main(String[] args) {
        HashMap<String,String> obj =  new HashMap<>();
        // in hash map key are always unique
        // if you try to insert duplicate key 
        // then value of previous key would be updated
        // insert the data in hashmap 
        //  hash map is unsyncronized
        //  non thread safe
        // put function
        obj.put("name","Aman");
        // get the value of particular key
        String str = obj.get("name");
        System.out.println(str);
        // to update the value we use put function
        obj.put("name", "divya");
        System.out.println(obj);
        obj.put("friend", "divya");
        System.out.println(obj);
        System.out.println(obj.containsKey("friend"));
        //remove data
        obj.remove("name");
        System.out.println(obj);
        obj.put("name", "Aman");
        obj.put("Mobile", "1234567890");
        obj.put(null, "my null key") ;
               // iterating over the hashmap
        for (Map.Entry<String, String> i : obj.entrySet()) {
            System.out.println(i.getKey() +" " + i.getValue());
        }

        for (String s : obj.keySet()) {
            System.out.println(s + "=> " + obj.get(s));
        }
        //  hash table is syncronized
        //  thread safe
        Hashtable<String,String> obj2 =new Hashtable<>();
        obj2.put("name","Dharam");
        System.out.println(obj2);
        // obj2.put(null,"null here too");
        // System.out.println(obj2);

        // Hash set
        //  hashset is built over hashmap
        // follows set property

        // HashMap<String,String> myset = new HashMap<>();
        // myset.put("Aman", null);


        // myset.put("divya", null);
        // myset.put("dharam", null);
        // myset.put("jack", null);
        // myset.put("jo", null);
        // System.out.println(myset.keySet());

        HashSet<String> myset = new HashSet<>();
        myset.add("Aman");
        myset.add("divya");
        myset.add("Dharam");
        System.out.println(myset);
        myset.remove("divya");
        System.out.println(obj2.contains("divya"));
        
        


    }

    
}
