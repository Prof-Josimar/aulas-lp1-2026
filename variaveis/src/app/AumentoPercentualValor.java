package app;

import java.util.Scanner;

public class AumentoPercentualValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor antigo: ");
        double valorAntigo = scanner.nextDouble();

        System.out.print("Digite o valor novo: ");
        double valorNovo = scanner.nextDouble();

        double resultado = calcularAumentoPercentual(valorAntigo, valorNovo);

        System.out.printf("O aumento percentual é: %.2f%%\n", resultado);

        scanner.close();
    }

    // Método que resolve o cálculo da imagem
    public static double calcularAumentoPercentual(double valorAntigo, double valorNovo) {
        return ((valorNovo - valorAntigo) / valorAntigo) * 100;
    }
}
