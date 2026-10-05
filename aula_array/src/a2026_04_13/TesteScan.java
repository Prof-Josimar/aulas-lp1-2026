package a2026_04_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite nomes (digite 'fim' para encerrar):");
        while (true) {
            String entrada = scan.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            nomes.add(entrada);
        }

        System.out.println("Lista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
