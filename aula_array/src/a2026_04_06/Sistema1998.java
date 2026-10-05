package a2026_04_06;

import java.util.Random;

public class Sistema1998 {

    public static void main(String[] args) {
        

                Random rnd = new Random(); // Inicia Aleatório
        int x = rnd.nextInt(100); // Gera um número aleatório (0 – 99)
        for (int i = 0; i <100 ; i++) {
            x = rnd.nextInt(100); // Gera um número aleatório (0 – 99)
            System.out.print(x + " ");
        }


    }

}
