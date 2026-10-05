package view;

import model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppPessoa {

    static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        /*
        Se você quiser aceitar vírgula (mais natural no Brasil), basta trocar para:
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
         */

        List<Pessoa> lista = new ArrayList<>();

        int opcao = 1;

        while (opcao == 1) {
            System.out.println("Digite o id:");
            int id = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite o email:");
            String email = sc.nextLine();

            System.out.println("Digite o salário:");
            double salario = sc.nextDouble();
            sc.nextLine();

            Pessoa p = new Pessoa(id, nome, email, salario);
            lista.add(p);

            System.out.println("Pessoa adicionada: " + p);

            System.out.println("Deseja adicionar outra pessoa? (1 - Sim / 0 - Não)");
            opcao = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nLista final de pessoas:");
        double totalSalarios = 0.0;
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
            totalSalarios += pessoa.getSalario();
        }

        System.out.println("\nAcumulado dos salários: R$ " + totalSalarios);
        sc.close();
    }
}
