import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        System.out.println("Enter a no.");
        var sc = new Scanner(System.in);
        var x = sc.nextInt();
        if (x >= 0) {
            System.out.println("No. is positive");
        } else {
            System.out.println("No. is negative");
        }
    }
}      
