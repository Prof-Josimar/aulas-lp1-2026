package a2026_04_06;


import java.util.Scanner;

public class PlanetaCorSorte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes;
        String planeta = "";
        String cor = "";

        // Loop até receber um mês válido
        while (true) {
            System.out.print("Digite o mês do seu nascimento (1 a 12): ");
            mes = scanner.nextInt();

            switch (mes) {
                case 1, 5, 9 -> {
                    planeta = "Saturno";
                    cor = "Verde";
                }
                case 2, 6, 10 -> {
                    planeta = "Vênus";
                    cor = "Azul";
                }
                case 3, 7, 11 -> {
                    planeta = "Júpiter";
                    cor = "Vermelho";
                }
                case 4, 8, 12 -> {
                    planeta = "Marte";
                    cor = "Amarelo";
                }
                default -> {
                    System.out.println("Mês inválido! Digite novamente.");
                    continue; // volta para o início do loop
                }
            }
            break; // sai do loop se chegou em um mês válido
        }

        System.out.println("Seu planeta regente é: " + planeta);
        System.out.println("Sua cor da sorte é: " + cor);

        scanner.close();
    }
}
