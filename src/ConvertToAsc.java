import java.util.Scanner;

public class ConvertToAsc {
    public static void main(String[] args) {
        char ch;
        int a;
        System.out.println("Enter a character.");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        a = ch;
        System.out.println("Ascii value" + a);
    }

}
