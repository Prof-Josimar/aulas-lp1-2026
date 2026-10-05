package a2026_04_07;

import java.util.Scanner;

public class Saudacao {

    public static String gerarSaudacao(String nome, char sexo, int hora) {
        String tratamento;

        // Tratamento direto, sem validação extra
        if (sexo == 'M' || sexo == 'm') {
            tratamento = "Sr. " + nome;
        } else {
            tratamento = "Sra. " + nome;
        }

        // Saudações conforme hora
        if (hora < 12) {
            return "Bom dia, " + tratamento;
        } else if (hora < 18) {
            return "Boa tarde, " + tratamento;
        } else {
            return "Boa noite, " + tratamento;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0); // pega só o primeiro caractere

        System.out.print("Digite a hora (0 a 23): ");
        int hora = scanner.nextInt();

        String mensagem = gerarSaudacao(nome, sexo, hora);
        System.out.println(mensagem);

        scanner.close();
    }
}
