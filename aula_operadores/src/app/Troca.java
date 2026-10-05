package app;

public class Troca {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("_________________________");

        a = 5;
        b = 10;
        a = a * b; // a = 50
        b = a / b; // b = 5
        a = a / b; // a = 10
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("_________________________");

        a = 5;
        b = 10;
        a = a ^ b; // a = 15
        b = a ^ b; // b = 5
        a = a ^ b; // a = 10
        System.out.println("a = " + a + ", b = " + b);

    }

}
