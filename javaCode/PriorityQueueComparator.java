package javaCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparator {
    
    public static void main(String[] args) {
        PriorityQueue<String> pq =new PriorityQueue<>(new CustomComparator());
        pq.add("Aman");
        pq.add("Rohan");
        pq.add("Dharam");
        pq.add("Divya");
        System.out.println(pq);
        PriorityQueue<Stud> sq = new PriorityQueue<>(new Comparator<Stud> (){
    

    @Override
    public int compare(Stud o1, Stud o2) {
        // TODO Auto-generated method stub
        if(o1.marks > o2.marks){
            // A-B
            return -1;
        }
        else if(o1.marks < o2.marks){
            return 1;
        }
        else{
            // if(o1.fName.compareTo(o2.fName) == 0){
            //     if(o1.lName.compareTo(o2.lName) == 0){
            //         return 0;
            //     }
            //     return o1.lName.compareTo(o2.lName);
            // }
            // return o1.fName.compareTo(o2.fName);
            if(o1.fName.compareTo(o2.fName) > 0 ){
                return 1;
            }
            else if(o1.fName.compareTo(o2.fName) < 0){
                return -1;
            }
            else{
                if(o1.lName.compareTo(o2.lName) >0){
                    return 1;
                }
                else if(o1.lName.compareTo(o2.lName) < 0){
                    return -1;
                }
                return 0;
            }
        }
    }
});
        sq.add(new Stud("Aman", "Saini", 50));
        sq.add(new Stud("Divya", "Rahtore", 75));
        sq.add(new Stud("Aman", "Singh", 50));
        sq.add(new Stud("Dharam", "Rathore", 50));
        sq.add(new Stud("Aman", "Singh", 80));
        
        System.out.println(sq);
        System.out.println(sq.remove());
        System.out.println(sq.remove());
        System.out.println(sq.remove());
        System.out.println(sq.remove());
        System.out.println(sq.remove());

    }
    
}

class CustomComparator implements Comparator<String> {
    

    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        if(o1.compareTo(o2) >= 1 ){
            return -1;
        }
        else{
            return 1;
        }
    }
}
class Stud {
    String fName;
    String lName;
    int marks;
    public Stud(String fName, String lName, int marks) {
        this.fName = fName;
        this.lName = lName;
        this.marks = marks;
    }
    @Override
    public String toString(){
        return this.fName +" "+this.lName +" " + this.marks;
    }
}

// class CustomComparatorForStud implements Comparator<Stud> {
    

//     @Override
//     public int compare(Stud o1, Stud o2) {
//         // TODO Auto-generated method stub
//         if(o1.marks > o2.marks){
//             // A-B
//             return -1;
//         }
//         else if(o1.marks < o2.marks){
//             return 1;
//         }
//         else{
//             // if(o1.fName.compareTo(o2.fName) == 0){
//             //     if(o1.lName.compareTo(o2.lName) == 0){
//             //         return 0;
//             //     }
//             //     return o1.lName.compareTo(o2.lName);
//             // }
//             // return o1.fName.compareTo(o2.fName);
//             if(o1.fName.compareTo(o2.fName) > 0 ){
//                 return 1;
//             }
//             else if(o1.fName.compareTo(o2.fName) < 0){
//                 return -1;
//             }
//             else{
//                 if(o1.lName.compareTo(o2.lName) >0){
//                     return 1;
//                 }
//                 else if(o1.lName.compareTo(o2.lName) < 0){
//                     return -1;
//                 }
//                 return 0;
//             }
//         }
//     }
// }
