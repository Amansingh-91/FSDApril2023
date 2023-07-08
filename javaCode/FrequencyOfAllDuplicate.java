package javaCode;

import java.util.HashMap;

public class FrequencyOfAllDuplicate {
    // find frequency of all duplicate numbers in given array
    // [1,2,3,4,2,3,2,4,5] 
    //  1 = 1 ,2 = 3 , 3= 2, ,4 = 2, 5 = 1
    public static void main(String[] args) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int arr [] = {1,2,3,4,2,3,2,4,5};
        for (int i = 0; i < arr.length; i++) {
            if(freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i]) + 1);
            }
            else{
                freq.put(arr[i], 1);
            }
        }

        for (Integer i : freq.keySet()) {
            System.out.println(i +" = "+ freq.get(i));
        }
    }
    // array of consecutive jumbled numbers . sort it in min time
    // arr[i] + 1 = arr[i +1];
    // [9,3,4,7,8,6,5] O(n)
}
