package br.com.abc.introducao.matriz;

import java.util.Scanner;

public class DiagonaisMatriz {
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

        // Diagonal principal
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        // Diagonal secundária
        System.out.print("Diagonal secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
