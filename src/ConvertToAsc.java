import java.util.Scanner;

public class ConvertToAsc {
    public static void main(String[] args) {
        System.out.println("Enter a character.");
        var sc = new Scanner(System.in);
        var a = sc.next().charAt(0);
        System.out.println("Ascii value" + a);
    }

}
