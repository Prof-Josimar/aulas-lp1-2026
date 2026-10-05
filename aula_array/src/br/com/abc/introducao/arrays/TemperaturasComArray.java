package br.com.abc.introducao.arrays;

public class TemperaturasComArray {
    public static void main(String[] args) {
        double[] temperaturas = new double[7];
        temperaturas[0] = 30.5; // Segunda
        temperaturas[1] = 28.0; // Terça
        temperaturas[2] = 27.3; // Quarta
        temperaturas[3] = 29.8; // Quinta
        temperaturas[4] = 31.2; // Sexta
        temperaturas[5] = 32.0; // Sábado
        temperaturas[6] = 26.7; // Domingo

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(dias[i] + ": " + temperaturas[i]);
        }
    }
}
