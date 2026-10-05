package a2026_04_08.view;


import a2026_04_08.model.Funcionario;

public class CalculoDescontosOO {
    public static void main(String[] args) {

        Funcionario joao = new Funcionario("João Filho", 1000, 100);
        Funcionario maria = new Funcionario("Maria Rute", 2000, 200);
        Funcionario jose = new Funcionario("José Salgado", 3000, 300);

        System.out.println("O valor do desconto de " + joao.getNome() + " é " + joao.calcularDescontos() + ".");
        System.out.println("O valor do desconto de " + maria.getNome() + " é " + maria.calcularDescontos() + ".");
        System.out.println("O valor do desconto de " + jose.getNome() + " é " + jose.calcularDescontos() + ".");

    }
}
