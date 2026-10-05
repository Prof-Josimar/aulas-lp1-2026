package internacional;

import java.util.*;

public class Main {

    static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); // Locale padrão
        Scanner sc2 = new Scanner(System.in).useLocale(Locale.US); // Locale forçado

        System.out.print("Digite um número com vírgula (ex: 3,14): ");
        double n1 = sc1.nextDouble();
        System.out.println("Lido com locale padrão: " + n1);

        System.out.print("Digite um número com ponto (ex: 3.14): ");
        double n2 = sc2.nextDouble();
        System.out.println("Lido com locale US: " + n2);
    }
}
