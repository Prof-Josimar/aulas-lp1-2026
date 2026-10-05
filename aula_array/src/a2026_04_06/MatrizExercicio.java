package a2026_04_06;

import java.util.Scanner;

public class MatrizExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int somaImpares = 0;

        // Preencher a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                // a) soma dos ímpares
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("a) Soma dos números ímpares: " + somaImpares);

        // b) soma de cada coluna
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("b) Soma da coluna " + j + ": " + somaColuna);
        }

        // c) soma de cada linha
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("c) Soma da linha " + i + ": " + somaLinha);
        }

        sc.close();
    }
}
