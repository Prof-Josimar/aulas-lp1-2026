package app;

import java.util.Scanner;

public class ProgramaWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n < 5) {
            System.out.println(n);
            System.out.println("Digite um numero maior que 5 para finalizar ? ");
            int num = sc.nextInt();
            if (num > 5) {
                System.out.println("Done !");
                break;
            }
        }
    }
}
