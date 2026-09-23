package view;

import java.util.Scanner;

class B_Multa_Ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro: ");
        int velocidade = Integer.parseInt(sc.nextLine());
        int valorMulta = 0;
        if (velocidade > 80) {
            valorMulta = (velocidade - 80) * 5;
            System.out.println("Sua multa é de R$" + valorMulta + " reais por ultrapassar o limite estabelecido!");
        } else {
            System.out.println("Parabéns pela sua velocidade!");
        }
        sc.close();

    }

}
