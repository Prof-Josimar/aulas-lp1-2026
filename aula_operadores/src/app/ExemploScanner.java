package app;

import java.util.Scanner;

public class ExemploScanner {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exemplo sem consumir a linha
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt(); // lê o número, mas deixa o ENTER na fila

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // lê até o ENTER, mas como já havia um ENTER pendente, ele lê vazio

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);


        // Exemplo corrigido (consumindo a linha)
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine(); // consome o ENTER que ficou pendente

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine(); // agora funciona corretamente

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);


        sc.close();
    }


}
