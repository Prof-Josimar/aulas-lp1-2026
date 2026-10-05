package aula1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = random.nextInt(100) + 1; // número entre 1 e 100
        int tentativa;
        int erros = 0;
        int tentativas = 0;
        System.out.println(numeroSorteado);

        System.out.println("Tente adivinhar o número (entre 1 e 100):");

        while (true) {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa == numeroSorteado) {
                System.out.println("Parabéns! Você acertou!");
                break; // sai do loop
            } else {
                erros++;
                if (tentativa < numeroSorteado) {
                    System.out.println("O número é maior!");
                } else {
                    System.out.println("O número é menor!");
                }
            }
        }

        System.out.println("Número sorteado: " + numeroSorteado);
        System.out.println("Total de tentativas: " + tentativas);
        System.out.println("Total de erros: " + erros);

        scanner.close();
    }
}
