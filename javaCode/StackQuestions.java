package javaCode;

import java.util.Stack;

public class StackQuestions {
    public static boolean isDigit(char ch){
        if(ch >= '0' && ch <='9'){
            return true;
        }
        return false;
    }
    public static boolean isAlpha(char ch){
        if((ch >= 'a' && ch <='z' )|| (ch >= 'A' && ch <='Z') ){
            return true;
        }
        return false;
    }
    public static int precidence(char ch){
        switch (ch) {
            case '+':
                
            case '-':
                return 1;
            case '*':
                
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
            
        }
        return -1;
    } 
    public static String infixToPostfix(String eq){
        String result = "";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < eq.length(); i++) {
            char ch = eq.charAt(i);
            if(isDigit(ch) || isAlpha(ch)){
                result += ch;
            }
            else if(ch == '('){
                s.push('(');
            }
            else if( ch == ')'){
                while (s.peek() != '(') {
                    result += s.pop();   
                }
                s.pop();
            }
            else{
                
                if(s.isEmpty() || precidence(s.peek()) < precidence(ch)){
                    s.push(ch);
                }
                
                else{
                    while (!s.isEmpty() && precidence(s.peek()) >= precidence(ch)) {
                       result += s.pop();
                    }
                    s.push(ch);
                }
            }

        }
        while (!s.isEmpty()) {
            result += s.pop();   
        }
        return result;
    }
    public static String reverseString(String str){
        String res = "";
        // a + ( b * c) => ) c * b ( 
        for (int i = str.length() -1; i>=0; i--) {
            if(str.charAt(i) == '('){
                res += ')';
            }
            else if(str.charAt(i) == ')'){
                res += '(';
            }
            else{
                res += str.charAt(i);
            }
        }
        return res;
    }
    public static String infixToPrefix(String eq){
        
        eq = reverseString(eq);
        eq = infixToPostfix(eq);
        return reverseString(eq);
    }

    public static void nextGreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        int ele ;
        for (int i = 1; i < arr.length; i++) {//n-1
            ele = arr[i]; 
            System.out.println("in for");

            while(!s.isEmpty() && s.peek() < ele){
                System.out.println(s.pop() +"->" + ele);
            }
            s.push(ele);
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop() +"->" + -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("(a+b)*c"));//ab+c*
        System.out.println(infixToPostfix("a*b+c"));

        System.out.println(infixToPrefix("a+b"));
        int arr[] = {15,10,22,4,3,16,12,4,17,9};
        StackQuestions.nextGreater(arr);
    }    
}
    

