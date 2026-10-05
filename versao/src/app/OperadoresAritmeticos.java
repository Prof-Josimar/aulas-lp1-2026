package app;

import java.math.BigDecimal;
import java.util.Locale;

public class OperadoresAritmeticos {



    public static void main(String[] args) {
        // são eles + - / * e %
        int a = 10;
        int b = 3;

        Locale.setDefault(Locale.US);

        System.out.println("Soma.............: " + (a + b));
        System.out.println("Subtração........: " + (a - b));
        System.out.println("Multiplicação....: " + (a * b));

        System.out.println("Divisão..........: " + (a / b));
        System.out.println("Resto da divisão.: " + (a % b));

        System.out.println(7 % 3);
        System.out.println(7 / 3);
        System.out.println(7.0 / 3.0);
        System.out.println(0.7+0.1);

        BigDecimal c = new BigDecimal("0.7");
        BigDecimal d = new BigDecimal("0.1");
        System.out.println(c.add(d)); // Saída: 0.8
        System.out.printf("%.2f ",c.add(d));



    }

}
