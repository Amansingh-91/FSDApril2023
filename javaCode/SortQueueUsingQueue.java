package javaCode;

import java.util.LinkedList;
import java.util.Queue;

public class SortQueueUsingQueue {
    public static void sortQueue(Queue<Integer> q1){
        Queue<Integer> temp = new LinkedList<>();
        int n= q1.size();
        
        for (int i = 1; i <= n-1; i++) {
            int min = q1.poll();
            int minI = 0;
            for (int j = 1; j <q1.size() ; j++) {
                int del = q1.poll();
                // System.out.println(del);
                if(min > del){
                    
                    min = del;
                    minI = j;
                    // System.out.println("new min"+ min +"min index" + minI);
                }
                q1.add(del);
            }
            
            while (minI >0) {

                q1.add(q1.poll());
                minI--;
            }
            temp.add(q1.poll());
            System.out.println(n);
            System.out.println(temp);
        } 
        
        
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(12);
        q1.add(15);
        q1.add(4);
        q1.add(9);
        q1.add(20);
        sortQueue(q1);
    }
}
