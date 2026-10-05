package br.com.abc.introducao.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Doacao {

    public static void main(String[] args) {
        float valor;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra : ");
        valor = sc.nextFloat();
        if (valor % 2 == 0) {
            System.out.println("Valor redondo");
        } else {
            int inteiro = (int) valor;
            inteiro += 1;
            float doacao = inteiro - valor;
            System.out.println("Valor fracionado");
            System.out.printf("Doação %.2f", doacao);
        }
        sc.close();

    }

}
