package javaCode;

public class JumpStatement {
    // three jump statements
    // break -> use only inside switch case and loops
    //break is used to break you out of some condition 

    // continue -> used only inside loops
    // continue means skip the current repetation and start the next repeatation
    
    // return -> is used inside functions
    // return is used to return some value from the function 

    public static void main(String[] args) {
        banana:
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {

                if(i == 3){
                    // labbled break
                    // break banana;
                    // continue banana;
                    break;
                }
                System.out.println(i);
            }
        }
        // for (int i = 0; i < 5; i++) {

        //     if(i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
    }
}
