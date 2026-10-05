package a.b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LerIntString {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Digite um número inteiro: ");
            int numero = Integer.parseInt(br.readLine()); // lê como String e converte para int

            System.out.print("Digite uma palavra: ");
            String palavra = br.readLine(); // lê como String

            System.out.println("Número: " + numero);
            System.out.println("Palavra: " + palavra);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
