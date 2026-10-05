package a2026_04_07;

import java.util.Random;
import java.util.Scanner;

public class MatrizAleatoria {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz com números aleatórios de 0 a 9
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = random.nextInt(10); // números entre 0 e 9
            }
        }

        // Mostra a matriz
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Usuário digita um número
        System.out.print("Digite um número entre 0 e 9: ");
        int numero = scanner.nextInt();

        // Conta quantas vezes aparece
        int contador = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Encontado em "+i + ","+j);
                    contador++;
                }
            }
        }

        System.out.println("O número " + numero + " aparece " + contador + " vezes na matriz.");
    }
}
