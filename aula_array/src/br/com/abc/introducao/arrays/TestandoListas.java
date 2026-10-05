package br.com.abc.introducao.arrays;
/*

https://www.alura.com.br/conteudo/java-collections

*/
import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        System.out.println("\n");
        // For tradicional (usando índice)
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula " + (i+1) + ": " + aulas.get(i));
        }
        //For-each (mais simples e legível)

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //Usando forEach com lambda (Java 8+)
        aulas.forEach(aula -> System.out.println("Aula: " + aula));


    }
}
