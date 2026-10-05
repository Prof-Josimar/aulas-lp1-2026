package app;

public class Multi7 {


    public static void main(String[] args) {
        int acm = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " , ");
                acm += i;
            }
        }
        System.out.println("\nAcunulado " + acm);
    }

}
