package app;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVendas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o numero de sócios ? ");
        int numeroSocios = sc.nextInt();
        double acumulado = 0.0;

        double valorVenda = 0.0;

        System.out.println("Digite o valor da venda ou 0 pra fim: ");
        valorVenda = sc.nextDouble();

        while (valorVenda != 0) {
            acumulado += valorVenda;

            System.out.printf("Cada sócio receberá  : %.2f : ", (acumulado / numeroSocios));

            System.out.println("Digite o valor da venda ou 0 pra fim: ");
            valorVenda = sc.nextDouble();
            System.out.println("\n");
        }
        System.out.println("Fim");
    }
}
