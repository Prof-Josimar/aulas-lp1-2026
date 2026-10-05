package a2026_04_08.model;


public class Funcionario {
    private String nome;
    private double salario;
    private double previdencia;

    public Funcionario(String nome, double salario, double previdencia) {
        this.nome = nome;
        this.salario = salario;
        this.previdencia = previdencia;
    }

    public double calcularDescontos() {
        return Math.round((salario * 0.275 + previdencia) * 100.0) / 100.0;
    }

    public String getNome() {
        return nome;
    }
}
