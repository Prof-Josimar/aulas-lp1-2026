package app;

import java.util.Locale;
import java.util.Scanner;

public class SistemaPDV {


    static void main() {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        char respostaAbreCaixa;
        char respostaVenda;
        int numeroVenda = 0;
        double acumuladoVenda = 0.0;
        System.out.println("Deseja abrir o caixa para vendas ? ");
        respostaAbreCaixa = sc.next().toUpperCase().charAt(0);

        while (respostaAbreCaixa == 'S') {
            System.out.println("Venda numero " + (++numeroVenda));

            do {

                System.out.println("Digite o valor do item : ");
                double valorItem = sc.nextDouble();

                System.out.println("Digite a quantidade : ");
                double qtd = sc.nextDouble();

                double subTotal = valorItem * qtd;
                acumuladoVenda += subTotal;
                System.out.println("SubTotal " + subTotal);


                System.out.println("Deseja acrescentar itens ? ");
                respostaVenda = sc.next().toUpperCase().charAt(0);
            } while (respostaVenda != 'N');
            System.out.println("FECHAMENTO DA COMPRA");
            System.out.println("Total da Venda " + acumuladoVenda);

            double valorPago = 0.0;
            do {
                System.out.println("Digite o valor pago : ");
                valorPago = sc.nextDouble();
                if (valorPago < acumuladoVenda) {
                    System.out.println("Valor pago insuficiente ");
                }
            } while (valorPago < acumuladoVenda);
            double troco = valorPago - acumuladoVenda;
            System.out.println("Troco  " + troco);
            acumuladoVenda = 0.0;

            System.out.println("Deseja fazer mais vendas ? ");
            respostaAbreCaixa = sc.next().toUpperCase().charAt(0);

        }


        sc.close();
        System.out.println("FECHAMENTO DO CAIXA");
    }// fecha bloco main

}// fecha classe
