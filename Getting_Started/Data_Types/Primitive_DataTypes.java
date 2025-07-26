import java.lang.*;
import java.util.*;

public class Primitive_DataTypes {
    public static void main(string[] args) {
        //    Numeric Data Types
        //    Integer Types: byte, short, int, long 
        //    Floating Point Types: float, double
        byte smallNumber = 100; // 8-bit signed integer it can hold values from -128 to 127
        System.out.println("Small Number: " + smallNumber   + " (byte)");
        //    Integer Type: short
        //    Short Type: short
        short mediumNumber = 10000; // 16-bit signed integer   it can hold values from -32,768 to 32,767    
        System.out.println("Medium Number: " + mediumNumber + " (short)");
        //    Integer Type: int 

        int largeNumber = 1000000; // 32-bit signed integer it can hold values from -2,147,483,648 to 2,147,483,647
        System.out.println("Large Number: " + largeNumber + " (int)");
        //    Integer Type: long
        //    Long Type: long
        long veryLargeNumber = 10000000000L; // 64-bit signed integer it can hold values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // Note: 'L' at the end indicates that this is a long literal
        //       without 'L', it would be treated as an int and cause a compilation error
        System.out.println("Very Large Number: " + veryLargeNumber + " (long)");
        //    Floating Point Type: float
        //    Float Type: float
        // Note: 'f' at the end indicates that this is a float literal
        //       without 'f', it would be treated as a double and cause a compilation error
        float decimalNumber = 3.14f; // 32-bit floating point it can hold decimal numbers with less precision
        //       it can hold values from approximately -3.40282347E+38 to
        System.out.println("Decimal Number: " + decimalNumber + " (float)");
        //    Floating Point Type: double
        //    Double Type: double
        double largeDecimalNumber = 3.141592653589793; // 64-bit floating point it can hold very large and precise decimal numbers
        System.out.println("Large Decimal Number: " + largeDecimalNumber + " (double)");




        //  Non-Numeric Data Types
        //    Character Type: char
        //    Boolean Type: boolean

        char letter = 'A'; // Character type it also includes +, -, *, /, etc.
        System.out.println("Letter: " + letter + " (char)");
        boolean isJavaFun = true; // Boolean type it can be true or false
        System.out.println("Is Java Fun? " + isJavaFun + " (boolean)"); 

    }
}