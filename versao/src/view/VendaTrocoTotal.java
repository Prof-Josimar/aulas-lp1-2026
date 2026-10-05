package view;

import java.util.Locale;
import java.util.Scanner;

public class VendaTrocoTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int vendaNum = 0;
        char respostaCaixa;
        char respostaVenda;
        double acumuladoGeral = 0.0;
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║        SISTEMA DE VENDAS         ║");
        System.out.println("║            CAIXA ABERTO          ║");
        System.out.println("╚══════════════════════════════════╝");


        System.out.println("Abrir caixa para vendas ? (S/N)");
        respostaCaixa = sc.next().toUpperCase().charAt(0);

        while (respostaCaixa == 'S') { // loop de abertura de vendas
            System.out.println("Venda número: " + (++vendaNum));
            double acumuladoVenda = 0.0;

            do { // loop de inclusão de itens
                System.out.print("Digite o valor do item: ");
                double item = sc.nextDouble();
                System.out.println("Digite a quantidade de itens: ");
                double qtd = sc.nextDouble();
                double subtotal = item * qtd;
                acumuladoVenda += subtotal;
                System.out.printf("\nSubtotal : %.2f " , subtotal);
                System.out.println("\nIncluir mais itens ? (S/N)");
                respostaVenda = sc.next().toUpperCase().charAt(0);
            } while (respostaVenda != 'N');

            acumuladoGeral += acumuladoVenda;
            System.out.printf("Total da venda : %.2f " ,acumuladoVenda);

            double valorPago;
            do { // loop para garantir que o valor pago seja suficiente
                System.out.println("Digite o valor pago: ");
                valorPago = sc.nextDouble();
                if (valorPago < acumuladoVenda) {
                    System.out.println("Valor pago insuficiente, digite novamente: ");
                }
            } while (valorPago < acumuladoVenda);

            double troco = valorPago - acumuladoVenda;
            System.out.printf("Troco...: %.2f ", troco);
            // Espera ENTER
            System.out.println("\n\nTECLE ENTER\n\n");
            sc.nextLine(); // consome o \n que sobrou do nextDouble
            sc.nextLine(); // agora espera o ENTER do usuário

            // Limpa a tela (ANSI)
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nDeseja fazer outra venda ? (S/N)");
            respostaCaixa = sc.next().toUpperCase().charAt(0);
        }

        sc.close();
        System.out.println("Programa encerrado!");
        System.out.printf("Total vendido:  %.2f" , acumuladoGeral);
        System.exit(0);
    }
}
