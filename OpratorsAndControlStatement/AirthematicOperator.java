import java.util.*;


class AirthematicOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        // Addition Operators
        System.out.println(a+b + " Addition");

        // Subtraction 
        System.out.println(a-b+ " Subtraction");

        // Multiplication
        System.out.println(a*b + " Multiplication");

        // Division
        System.out.println(a/b + " Division"); //  It will only print integer value not decimal
        System.out.println(a/(float)b + " Division with decimal value"); // it will return whole value with include decimal

        // Modulo Operator
        System.out.println(a%b + " Modulo"); // It will print remainder value like a = 10, b=8 then remainder is 2 
        
        

    }

    
}