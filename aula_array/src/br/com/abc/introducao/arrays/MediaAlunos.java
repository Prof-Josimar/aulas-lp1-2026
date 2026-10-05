package br.com.abc.introducao.arrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlunos {

    public static final int NUM = 2;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String nome[] = new String[NUM];
        int matricula[] = new int[NUM];
        float nota1[] = new float[NUM];
        float nota2[] = new float[NUM];
        float nota3[] = new float[NUM];

        for (int i = 0; i < NUM; i++) {
            System.out.println("Nome  : ");
            nome[i] = sc.next();
            System.out.println("Nota 1 ");
            nota1[i] = sc.nextFloat();
        }

        sc.close();

    }
}
