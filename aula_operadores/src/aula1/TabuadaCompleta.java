package aula1;

public class TabuadaCompleta {

    public static void main(String[] args) {

        for (int index = 1; index < 11; index++) {

            for (int i = 1; i < 11; i++) {
                System.out.println(index + " X " + i + " = " + (index * i));
            }
            System.out.println("_________________________________");

        }

    }

}
