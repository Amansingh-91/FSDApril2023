package javaCode;


public class StringDemo{

    public static void removeSpaces(String str){
        for (int i =0; i<str.length();i++) {
            char ch =  str.charAt(i);
            if(ch != ' '){
                System.out.print(ch);
            }
        }

        System.out.println();
    }
    
    public static int countWords(String str){
        boolean started = false;
        int count =0;
        for (int i =0; i<str.length();i++) {
            char ch =  str.charAt(i);
            if((ch != ' ' && ch != '.') && !started){
                started = true;
            }
            else if((ch == ' ' && started) || (ch == '.' && started)){
                count++;
                started = false;
            }
        }
        return count;
    }

    public static void printWords(String str){
        boolean started = false;
        String word = "";
        for (int i =0; i<str.length();i++) {
            char ch =  str.charAt(i);
            
            if((ch != ' ' && ch != '.') && !started){
                started = true;
                // System.out.print(ch);
                word += ch;
            }else if((ch != ' ' && ch != '.') && started){
                word +=ch;
                // System.out.println(word+"*");
            }
            else if((ch == ' ' && started) || (ch == '.' && started)){
                
                started = false;
                System.out.println(word);
                word = "";
            }
            
        }
        
    }

    public static String mySubStr(String str,int startIndex){
        String word = "";
        for (int i = startIndex; i <str.length() ; i++) {
            word += str.charAt(i);
        }
        return word;
    } 

    public static String mySubStr(String str,int startIndex,int endIndex){
        String word = "";
        for (int i = startIndex; i <endIndex ; i++) {
            word += str.charAt(i);
        }
        return word;
    }

    public static void main(String[] args) {
        String str = "  I   am aman saini . I am software engineer   ";
        // char arr[] =  str.toCharArray();
        // for (int i = 0; i < str.length(); i++) {
        //     char ch =  str.charAt(i);
        //     System.out.println();
        // }

        removeSpaces(str);
        
        System.out.println(countWords(str));

        printWords(str);

        System.out.println(mySubStr(str, 9, 13));

    }

}