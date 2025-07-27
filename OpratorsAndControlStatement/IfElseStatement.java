
import java.util.*;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weather = sc.nextLine();

        if(weather.equals("rainy")){
            System.out.println("Take umbrella");
        }
        else if(weather.equals("sunny")){
            System.out.println("Wear a Sun Glass");
        }
        else{
            System.out.println("Go Out and Enjoy");
        }
    }
    
}
