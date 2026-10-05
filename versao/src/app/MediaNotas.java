package app;

import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int id;
        String nome;
        float nota1, nota2, nota3;
        System.out.println("Digite o id : ");
        id = sc.nextInt();
        System.out.println("Digite o nome : ");
        nome = sc.next();
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
        System.out.println("Media "+calculaMedia(nota1,nota2,nota3));
        sc.close();

    }

    public static float calculaMedia(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }


    

}


