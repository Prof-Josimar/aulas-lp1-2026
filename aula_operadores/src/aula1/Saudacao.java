package aula1;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite a hora (0 a 23): ");
        int hora = sc.nextInt();

        // Chama método de saudação
        saudacao(nome, sexo, hora);

        sc.close();
    }

    public static void saudacao(String nome, char sexo, int hora) {
        String tratamento = (sexo == 'M') ? "Senhor " : "Senhora ";

        if (hora < 12) {
            System.out.println("Bom dia " + tratamento + nome);
        } else if (hora < 18) {
            System.out.println("Boa tarde " + tratamento + nome);
        } else {
            System.out.println("Boa noite " + tratamento + nome);
        }
    }
}
