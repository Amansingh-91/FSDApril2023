
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CommandLine {
    public static void main(String[] args) throws IOException
    {
        // Enter data using BufferReader
        
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        // System.out.println(name);
        
        
 
        // Reading data using readLine
        String name1 = reader.readLine();
 
        // Printing the read line
        // System.out.println(name1);
       
 
        // Reading data using readLine
        String name2 = reader.readLine();

        System.out.println("input cpmplete");
 
        // Printing the read line
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

    }
}
