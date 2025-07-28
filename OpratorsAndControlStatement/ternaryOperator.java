import java.util.*;

public class ternaryOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String ans = num%2 == 0 ? "Even": "Odd"; // Ternanry Operator is use to write single line code avoid to use if else condition statement. we can use both if else or ternary.
        System.out.println(ans);
    }

}