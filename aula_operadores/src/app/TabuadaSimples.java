package app;

import java.util.Scanner;


public class TabuadaSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro : ");
        int num = sc.nextInt();

        int j = 5;
        while (j <= 10) {
            System.out.println(num + " X  " + j + "  =  " + (j * num));
            j++;
        }


    }
}

