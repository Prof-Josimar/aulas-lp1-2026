package a2026_04_07;

import java.util.Scanner;

public class ExFuncao {


    public static void main(String[] args) {
        int opcao;
        do {

            opcao = MostraMenu();
        } while (opcao != 2);
    }

    public static int MostraMenu() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("=== MENU ===");
        System.out.println("1 - Mostrar de novo");
        System.out.println("2 - Sair");
        return Integer.parseInt(entrada.nextLine());
    }

    public static double calcDesc(double va, double pc) {
        double vd = va * (pc / 100);
        return va - vd;
    }

}
