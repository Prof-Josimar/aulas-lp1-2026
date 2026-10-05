package app;
import java.util.Scanner;

public class VariacaoPercentual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor antigo: ");
        double valorAntigo = scanner.nextDouble();

        System.out.print("Digite o valor novo: ");
        double valorNovo = scanner.nextDouble();

        exibirVariacao(valorAntigo, valorNovo);

        scanner.close();
    }

    // Método que calcula e identifica o tipo de variação
    public static void exibirVariacao(double antigo, double novo) {
        double variacao = ((novo - antigo) / antigo) * 100;

        if (variacao > 0) {
            System.out.printf("Houve um acréscimo de %.2f%%\n", variacao);
        } else if (variacao < 0) {
            System.out.printf("Houve um desconto de %.2f%%\n", Math.abs(variacao));
        } else {
            System.out.println("Não houve variação.");
        }
    }
}
