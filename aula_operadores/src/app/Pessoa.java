package app;

public class Pessoa {


    private int id;
    private String nome;
    private String telefone;


    public String consultaDados(int id) {
        return this.nome;
    }


    public boolean excluir(int id) {

        return true;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
