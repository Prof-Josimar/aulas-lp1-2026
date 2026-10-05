package app;

import java.util.Scanner;

public class AumentoPercentual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade anterior: ");
        double quantidadeAnterior = scanner.nextDouble();

        System.out.print("Digite a nova quantidade: ");
        double novaQuantidade = scanner.nextDouble();

        double aumento = calcularAumentoPercentual(quantidadeAnterior, novaQuantidade);

        System.out.printf("O aumento percentual foi de %.2f%%\n", aumento);

        scanner.close();
    }

    // Método estático separado
    public static double calcularAumentoPercentual(double anterior, double nova) {
        return ((nova - anterior) / anterior) * 100;
    }
}
