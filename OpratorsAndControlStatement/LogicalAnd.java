import java.util.*;


public class LogicalAnd {
    public static void main(String[] args) {

        int age = 24;
        String citizenShip = "Indian";

        if(age >= 18 && citizenShip == "Indian"){ // Simple Logical (&) Operator
            // Logical Short Circuit && output is same as Simple Logical AND but Logical Short Circuit (&&) Check both condition.  we use logical short circuit is optimize version.
            System.out.println("Person May Vote");
        }
        else{
            System.out.println("Person Can't Vote");
        }
        
    }
    
}
