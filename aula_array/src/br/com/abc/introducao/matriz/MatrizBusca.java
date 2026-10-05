package br.com.abc.introducao.matriz;


public class MatrizBusca {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("\n");
        }

        System.out.println("____________________");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println("\n");
        }

    }
}
