package Day1assignments;
import java.util.*;

public class reverse{
    public static void main(String[] args) {
       int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        input = sc.nextInt();
        System.out.print("Its reversal is ");
        rev(input);
        System.out.println();;
    }
    public static void rev(int number) {
        if (number < 0) {
            System.out.print("-");
            rev(number * -1);
        } else if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            rev(number / 10);
        }
    }
}
