import java.util.*;

public class typeCasting {
    public static void main(String[] args){
        int i = 20;
        long l = i; // Type Casting convert Integer i to a Long Data type 
        // Converting small data type to large data types is called Widening Type Casting (Automatically done by Java)
        System.out.println(l);

        // Explicit Type Casting
        // When we doing explicit type casting some of the conversion is lossy conversion so we need to take care of it. Java will not through an error.
        long x = 1000000;
        int y = (int) x; // Here we need to defind explictly types because we converting large type casting to small type casting
        System.out.println(y);

        int z = 2000;
        byte s = (byte) z; // Lossy Conversions our data was lost
        System.out.println(s); // The output is -48 because i am converting large type casting to small type casting 

    }
}
