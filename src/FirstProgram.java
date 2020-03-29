import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        int x;
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();
        System.out.println("Test" + x);
        System.out.println("Enter a float");
        a = sc.nextFloat();
        System.out.println("Test" + a);
    }
}
