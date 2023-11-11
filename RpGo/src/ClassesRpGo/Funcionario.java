package ClassesRpGo;

public class Funcionario extends Pessoa{
    private String usuario;
    
    private String senha;

    public Funcionario() {
        super();
        this.usuario = "";
        this.senha = "";
    }

    public Funcionario(int id, String nome, String dataDeNascimento, String usuario, String senha) {
        super(id, nome, dataDeNascimento);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
