
package ClassesRpGo;

public abstract class Pessoa {
    protected int id;
    
    protected String nome;
    
    protected String dataDeNascimento;

    public Pessoa() {
        this.id = 0;
        this.nome = "";
        this.dataDeNascimento = "";
    }

    public Pessoa(int id, String nome, String dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
