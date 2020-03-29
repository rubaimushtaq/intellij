import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter a number");
        var x = sc.nextInt();
        System.out.println("Test" + x);
        System.out.println("Enter a float");
        var a = sc.nextFloat();
        System.out.println("Test" + a);
    }
}
