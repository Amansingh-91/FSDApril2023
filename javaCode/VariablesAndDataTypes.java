package javaCode;

class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Variables - are content/ block in memory which are used to store some data under some name
        // java is strict type language
        // we have to specify what type of data we are going to store in memory
        // so java has somting known as data Type
        // data types define that what data we are going to store in memory

        // two types of data types in java 
        // primitive type 
        // boolean = 1bit, byte = 8 bits, short = 16 bits , char = 16bits, int = 32bits, long = 64 bits, float= 32 bits (stores decimal point value) , double = 64 bits (stores decimal point value)
        // predefined data types whose size is fixed

        // syntax of creating variable
        // data_Type variable_name = value;

        int age = 129;
        // TypeCasting - converting one data type to another
        // widening /implicit = automatic => smaller data type to bigger data type
        long x = age;

        // narrowing /explicit => mannual
        byte b = (byte) age;

        System.out.println(b);


    }
}
