package a.b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LerTeclado {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Digite seu nome: ");
            String nome = br.readLine(); // lê uma linha do teclado
            System.out.println("Olá, " + nome + "!");
        } catch (IOException e) {
            e.printStackTrace();
            //opção 2:imprimir apenas a mensagem do erro
            System.out.println(e.getMessage());
            // opção 3: imprimir o tipo da exceção
            System.out.println(e.toString());
        }
    }
}
