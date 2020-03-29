import java.util.Scanner;

public class AscToCh {
    public static void main(String[] args) {
        System.out.println("Enter a number.");
        var sc = new Scanner(System.in);
        var a = sc.nextInt();
        var ch = (char) a;
        System.out.println("Ascii char" + ch);
    }
}
