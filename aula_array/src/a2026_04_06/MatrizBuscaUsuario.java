package a2026_04_06;

import java.util.Scanner;

public class MatrizBuscaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Preenchendo a matriz com valores digitados pelo usuário
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Pedindo o número a ser buscado
        System.out.print("Digite um número para buscar na matriz: ");
        int numero = sc.nextInt();

        boolean encontrado = false;

        // Percorrendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Número encontrado na posição: [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado na matriz.");
        }

        sc.close();
    }
}
