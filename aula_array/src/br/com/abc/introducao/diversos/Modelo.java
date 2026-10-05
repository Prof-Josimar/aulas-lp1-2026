package br.com.abc.introducao.diversos;

import java.util.Locale;
import java.util.Scanner;

public class Modelo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Teste com ponto ");
        double dlbNum1 = sc.nextDouble();
        System.out.println("Teste com virgula ");
        double dlbNum2 = sc.nextDouble();// vai dar erro aqui


        System.out.println(dlbNum1 + " " + dlbNum2);


        sc.close();

    }

}