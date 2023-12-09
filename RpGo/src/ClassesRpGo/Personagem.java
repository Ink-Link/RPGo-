package ClassesRpGo;

import java.util.ArrayList;

public class Personagem {
    static public ArrayList<Personagem> listaPersonagens = new ArrayList();
    
    protected String nome;
    
    protected int corpo;
    
    protected int mente;
    
    protected int coragem;
    
    protected int hp;
    
    protected int plano;
    
    protected int determinacao;
    
    protected Stand stand;
    
    protected Pessoa dono;

    public Personagem(String nome, int corpo, int mente, int coragem, Stand stand, Pessoa dono) {
        this.nome = nome;
        this.corpo = corpo;
        this.mente = mente;
        this.coragem = coragem;
        
        this.hp = corpo; // Incompleto: HP = Corpo x d6 + rolagem de Durabilidade
        this.plano = mente;
        this.determinacao = coragem;
        
        this.stand = stand;
        
        this.dono = dono;
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

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

}
