package app;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 0;
        int chute = 0;
        int numero = rand.nextInt(10) + 1;
        while (numero != chute) {
            System.out.print("Digite seu palpite: ");
            chute = sc.nextInt();
            tentativas++;
            if (chute < numero) {
                System.out.println("o numero é maior");
            } else if (chute > numero) {
                System.out.println("o numero é menor");
            } else {
                System.out.println("Parabéns! Você acertou!");
                System.out.println("Número de tentativas: " + tentativas);
            }
        }
    }
}
