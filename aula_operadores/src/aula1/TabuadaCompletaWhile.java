package aula1;


public class TabuadaCompletaWhile {

    public static void main(String[] args) {

        int index = 1; // controla o número da tabuada
        while (index <= 10) {

            int i = 1; // controla o multiplicador
            while (i <= 10) {
                System.out.println(index + " X " + i + " = " + (index * i));
                i++;
            }

            System.out.println("_________________________________");
            index++;
        }
    }
}
