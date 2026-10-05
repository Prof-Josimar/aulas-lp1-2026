package a2026_04_08;

public class CalculoDescontos2 {

    public static void main(String[] args) {
        // João
        double joaoSalario = 1000;
        double joaoPrevidencia = 100;
        String joaoNome = "João Filho";

        double joaoImposto = joaoSalario * 0.275;          // etapa 1: calcular imposto
        double joaoTotal = joaoImposto + joaoPrevidencia;  // etapa 2: somar previdência
        double joaoDescontos = Math.round(joaoTotal * 100.0) / 100.0; // etapa 3: arredondar // gambiarra


        // Maria
        double mariaSalario = 2000;
        double mariaPrevidencia = 200;
        String mariaNome = "Maria Rute";

        double mariaImposto = mariaSalario * 0.275;
        double mariaTotal = mariaImposto + mariaPrevidencia;
        double mariaDescontos = Math.round(mariaTotal * 100.0) / 100.0;

        // José
        double joseSalario = 3000;
        double josePrevidencia = 400;
        String joseNome = "José Salgado";

        double joseImposto = joseSalario * 0.275;
        double joseTotal = joseImposto + josePrevidencia;
        double joseDescontos = Math.round(joseTotal * 100.0) / 100.0;

        // Saída
        System.out.println("O valor do desconto de " + joaoNome + " é " + joaoDescontos + ".");
        System.out.println("O valor do desconto de " + mariaNome + " é " + mariaDescontos + ".");
        System.out.println("O valor do desconto de " + joseNome + " é " + joseDescontos + ".");
    }
}
