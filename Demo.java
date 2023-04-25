import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 1 2 3 4
        // marks of student to be stored
        // suntax of array
        // data_type ver_name[] = new data_Type[size];

        int marks[] = new int[5];

        for (int i = 0; i < 5; i++) {
            // System.out.println("enter the marks");
            marks[i] = sc.nextInt();
            sc.nextLine();

        }

        System.out.println(marks[4]);


        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        System.out.println("Full name is " + fullName);


    }
}
