import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        System.out.println("Enter 2 nos.");
        var scanner = new Scanner(System.in);
        var x = scanner.nextInt();
        var y = scanner.nextInt();
        var z = x + y;
        System.out.println(z);
    }
}
