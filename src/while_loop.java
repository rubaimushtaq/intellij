public class while_loop {
    public static void main(String[] args) {
        int x = 1;
        while (x < 11) {
            if(x==5){  x++ ;
            continue;}
            System.out.println(x);
            x++;
        }
    }
}
