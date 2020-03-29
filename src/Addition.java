import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        System.out.println("Enter 2 nos.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = x + y;
        System.out.println(z);
    }
}
