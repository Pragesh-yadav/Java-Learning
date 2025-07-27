import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "rainy";

        switch (weather) {
            /* 
            This is a Example of enhanced switch case
            In enhance switch case we don't need break statement
            Only wrape with curly braces
            case ->{
                System.out.println("Take an umbrella")
            }
             */
            case "rainy":
                System.out.println("Take an umbrella");
                break;
            case "sunny":
                System.out.println("Wear sunglasses");
                break;
        
            default:
                System.out.println("Check weather forecast");
                
        }
    }
}
