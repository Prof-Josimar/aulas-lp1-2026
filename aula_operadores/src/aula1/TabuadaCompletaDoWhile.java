package aula1;

public class TabuadaCompletaDoWhile {

    public static void main(String[] args) {

        int index = 1; // controla o número da tabuada
        do {
            int i = 1; // controla o multiplicador
            do {
                System.out.println(index + " X " + i + " = " + (index * i));
                i++;
            } while (i <= 10);

            System.out.println("_________________________________");
            index++;
        } while (index <= 10);
    }
}
