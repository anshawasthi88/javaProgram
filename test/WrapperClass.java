package test;

public class WrapperClass {
    public static void  swap(int a , int b ){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }
}
