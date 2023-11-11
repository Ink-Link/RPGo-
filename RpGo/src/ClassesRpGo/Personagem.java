package ClassesRpGo;

public class Personagem {
    protected String nome;
    
    protected int corpo;
    
    protected int mente;
    
    protected int coragem;
    
    protected int hp;
    
    protected int plano;
    
    protected int determinacao;

    public Personagem(String nome, int corpo, int mente, int coragem, int hp, int plano, int determinacao) {
        this.nome = nome;
        this.corpo = corpo;
        this.mente = mente;
        this.coragem = coragem;
        this.hp = hp;
        this.plano = plano;
        this.determinacao = determinacao;
    }

    public Personagem() {
        this.nome = "";
        this.corpo = 0;
        this.mente = 0;
        this.coragem = 0;
        this.hp = 0;
        this.plano = 0;
        this.determinacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCorpo() {
        return corpo;
    }

    public void setCorpo(int corpo) {
        this.corpo = corpo;
    }

    public int getMente() {
        return mente;
    }

    public void setMente(int mente) {
        this.mente = mente;
    }

    public int getCoragem() {
        return coragem;
    }

    public void setCoragem(int coragem) {
        this.coragem = coragem;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public int getDeterminacao() {
        return determinacao;
    }

    public void setDeterminacao(int determinacao) {
        this.determinacao = determinacao;
    }   
}
