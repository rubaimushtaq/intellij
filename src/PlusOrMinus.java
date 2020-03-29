import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x >= 0) {
            System.out.println("No. is positive");
        } else {
            System.out.println("No. is negative");
        }
    }
}      
