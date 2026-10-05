package a2026_04_06;

import java.util.Scanner;

public class SomaLinhasColunas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Soma das linhas
        /*

            Soma das linhas
            Você fixa a linha (índice i) e percorre todas as colunas (índice j).

            Para cada linha, cria uma variável acumuladora (somaLinha).

            Vai somando todos os elementos daquela linha.


         */
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        // Soma das colunas

            /*


            Soma das colunas
            Agora você fixa a coluna (índice j) e percorre todas as linhas (índice i).

            Para cada coluna, cria uma variável acumuladora (somaColuna).

            Vai somando todos os elementos daquela coluna.
             */

        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }

        sc.close();
    }
}
