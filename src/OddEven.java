import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        var x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }
}
