public class CircleArea {
    public static void main(String[] args) {
       // funtry();
        float a, b;
        b=5.5f;
        a =  area(b);
        //funtry();
        System.out.println(a);
        System.out.println(area(5));
//funtry();
    }

    static float area(float x) {
        System.out.println("In float");
        final float pi = (float) 3.14;
        return (pi * x * x);
    }
    static float area(int x) {
        System.out.println("In int");
        final float pi = (float) 3.14;
        return (pi * x * x);
    }
    /*static void funtry(){
        System.out.println("Fun");
    }*/
}
