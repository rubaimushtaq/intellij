import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }
}
