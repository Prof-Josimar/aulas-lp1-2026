package br.com.abc.introducao.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PreencheLista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> aulas = new ArrayList<>();


        String entrada;
        do {
            System.out.println("Digite os nomes das aulas (digite 'fim' para parar):");
            entrada = sc.nextLine();
            if (!entrada.equalsIgnoreCase("fim")) {
                aulas.add(entrada);
                System.out.println("Adicionado ....");
            }
        } while (!entrada.equalsIgnoreCase("fim"));

        if (!aulas.isEmpty()) {
            System.out.println("Lista preenchida:");
            for (String aula : aulas) {
                System.out.print(aula + " | ");
            }
        } else {
            System.out.println("Nada a exibir");
        }

        sc.close();
    }
}
