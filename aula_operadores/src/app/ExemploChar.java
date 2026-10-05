package app;

import java.util.Scanner;

public class ExemploChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o sexo : ");
        char sexo = sc.next().charAt(0); // lê a primeira letra digitada


        System.out.println("Sexo digitado: " + sexo);
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Sexo masculino selecionado.");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Sexo feminino selecionado.");
        } else {
            System.out.println("Entrada inválida. Digite apenas M ou F.");
        }

        System.out.print("Digite a hora (0-23): ");
        int hora = sc.nextInt();
        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        sc.close();
    }
}
