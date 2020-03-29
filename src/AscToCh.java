import java.util.Scanner;

public class AscToCh {
    public static void main(String[] args) {
        char ch;
        int a;
        System.out.println("Enter a number.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        ch = (char) a;
        System.out.println("Ascii char" + ch);
    }
}
