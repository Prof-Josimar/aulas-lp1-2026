package a2026_04_13;

import java.util.ArrayList;
import java.util.List;

public class TesteIndice {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Índice: " + i + " - Conteúdo: " + nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println("Índice: " + nomes.indexOf(nome) + " - Conteúdo: " + nome);
        }

    }
}
