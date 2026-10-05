package a2026_04_08;
/*
Suponha que você queira criar um sistema que calcule o valor dos descontos mensais de um
funcionário de uma locadora de filmes. Por simplicidade, será assumido que o trabalhador irá pagar
o Imposto de Renda calculado como 27,5% do salário bruto mais a contribuição da Previdência
Social, que varia de trabalhador para trabalhador. Serão exibidas várias formas de se calcular os
descontos no salário deste funcionário.

 */
public class CalculoDescontos {
    public static void main(String[] args) {
        // João
        String joaoNome = "João Filho";
        double joaoSalario = 1000;
        double joaoPrevidencia = 100;

        double joaoDescontos = Math.round((joaoSalario * 0.275 + joaoPrevidencia) * 100.0) / 100.0;
        double joaoDescontos2 = (joaoSalario * 27.5 /100)+100;

        // Maria
        String mariaNome = "Maria Rute";
        double mariaSalario = 2000;
        double mariaPrevidencia = 200;
        double mariaDescontos = Math.round((mariaSalario * 0.275 + mariaPrevidencia) * 100.0) / 100.0;

        // José
        String joseNome = "José Salgado";
        double joseSalario = 3000;
        double josePrevidencia = 400;
        double joseDescontos = Math.round((joseSalario * 0.275 + josePrevidencia) * 100.0) / 100.0;

        // Saída
        System.out.println("O valor do desconto de " + joaoNome + " é " + joaoDescontos + ".");
        System.out.println("O valor do desconto de " + joaoNome + " é " + joaoDescontos2 + ".");
        System.out.println("O valor do desconto de " + mariaNome + " é " + mariaDescontos + ".");
        System.out.println("O valor do desconto de " + joseNome + " é " + joseDescontos + ".");
    }
}
