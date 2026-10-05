package app;

import java.util.Scanner;

public class Teste {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario do vendedor ");
        float salario = sc.nextFloat();
        float desconto = salario * 8 / 100;
        float salarioLiquido = salario - desconto;
        System.out.println("Desconto "+desconto);
        System.out.println("Salario Final "+ salarioLiquido);



    }
}
