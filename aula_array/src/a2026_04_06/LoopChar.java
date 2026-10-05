package a2026_04_06;

public class LoopChar {

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 97; i <= 122; i++) {

            char letra = (char) i;
            System.out.print(letra + " \t");
            contador++;
            if (contador % 5 == 0) {
                System.out.println("\n");
            }

        }
    }

}

/*

1. Crie programas em Java que crie e exiba as seguintes matrizes abaixo:

a)
a b c d e
f g h i j
l m n o p
q r s t u


 */