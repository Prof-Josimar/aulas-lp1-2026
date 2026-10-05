package model;

public class Pessoa {

    private int id;
    private String nome;
    private String email;
    private double salario;

    // Construtor completo
    public Pessoa(int id, String nome, String email, double salario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    // Construtor apenas com id e nome
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.email = "";       // valor padrão
        this.salario = 0.0;    // valor padrão
    }

    // Construtor sem parâmetros (default)
    public Pessoa() {
        this.id = 0;
        this.nome = "Sem nome";
        this.email = "";
        this.salario = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return String.format("%-5d %-15s %-25s %-10.2f", id, nome, email, salario);
    }
}


