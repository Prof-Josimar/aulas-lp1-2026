package app;

public class Cronometro {
    public static void main(String[] args) throws InterruptedException {

        for (int minuto = 0; minuto < 2; minuto++) {
            for (int segundo = 0; segundo < 30; segundo++) {

                System.out.printf("%02d:%02d%n", minuto, segundo);
                Thread.sleep(500);
            }
        }
    }
}
