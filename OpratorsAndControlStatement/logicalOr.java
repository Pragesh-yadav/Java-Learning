import java.util.*;

public class logicalOr {
    public static void main(String[] args) {
        
        String organization = "Arvind.org";

        if(organization == "Pragesh" | organization == "Arvind.org"){
            System.out.println("User is permitted");

        }
        else{
            System.out.println("User blocked");

        }

        // Logical Short Circuit OR
        // In this case if first expression is true then don't check second expression but if first expression is false then it will check second expression.
        
        if(organization == "Arvind.org" || organization == "APA"){  
            System.out.println("User Permitted");
        }
        else{
            System.out.println("User Not Permitted");
        }

    }
}