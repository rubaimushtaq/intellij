import java.util.Scanner;

public class StringLen
{
    public static void main(String [] args)
    {
        String txt;
        var scanner = new Scanner(System.in);
        txt = scanner.nextLine();
        System.out.println("String length is "+txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("but"));
        scanner.close();
    }
}
