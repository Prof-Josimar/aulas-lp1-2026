package a2026_04_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<String> descricoes = new ArrayList<>();
        List<Double> precos = new ArrayList<>();
        List<Double> quantidades = new ArrayList<>();

        while (true) {
            System.out.print("Digite a descrição do produto (ou 'fim' para sair): ");
            String descricao = sc.nextLine();

            if (descricao.equalsIgnoreCase("fim")) {
                break; // encerra o loop
            }

            System.out.print("Digite o preço (use ponto para decimais): ");
            double preco = sc.nextDouble();

            System.out.print("Digite a quantidade (use ponto para decimais): ");
            double quantidade = sc.nextDouble();
            sc.nextLine(); // consumir quebra de linha

            // adiciona nas listas
            descricoes.add(descricao);
            precos.add(preco);
            quantidades.add(quantidade);
        }

        // Exibindo os dados cadastrados com valor total
        System.out.println("\nProdutos cadastrados:");
        System.out.println("Descrição\tPreço\t\tQuantidade\tTotal");

        double totalGeral = 0.0;

        for (int i = 0; i < descricoes.size(); i++) {
            double valorTotal = precos.get(i) * quantidades.get(i);
            totalGeral += valorTotal;

            System.out.printf("%s\t\t\t%.2f\t\t%.3f\t\t%.2f%n",
                    descricoes.get(i),
                    precos.get(i),
                    quantidades.get(i),
                    valorTotal);
        }

        System.out.printf("\nValor total geral do estoque: %.2f%n", totalGeral);

        sc.close();
    }
}
