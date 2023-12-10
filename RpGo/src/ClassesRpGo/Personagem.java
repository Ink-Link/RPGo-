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
    public int rollContestada(String statusPrincipal, String statusSecundario){
        double dado1, dado2;
        
        int valor1, valor2;
        
        dado1 = Math.random() * 6 + 1;
       
        dado2 = Math.random() * 6 + 1;
        
        valor1 = (int) dado1 + Integer.parseInt(statusPrincipal);
        
        valor2 = (int) dado2 + Integer.parseInt(statusSecundario);
        
        return (valor1 - valor2);

    }
    public int rollIniciativa(String velocidadeStand, int corpoChar){
        
        double dado;
        
        int valor = 0;
        
        switch(velocidadeStand){
            case "a":
                
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado + 5 + corpoChar;
                
                break;
            case "b":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado + 3 + corpoChar;
                
                break;
            case "c":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado + 1 + corpoChar;
                
                break;
            case "d":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado - 3 + corpoChar;
                
                break;
            case "e":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado - 5 + corpoChar;
                
                break;
            default:
                break;
        }
        
        return valor;
    }
    public boolean planoVilanesco(Vilao vilao, Personagem personagem){
        double dado1, dado2;
        
        boolean passou = false;
        
        int numerosVilao, numerosPersonagem;
        
        dado1 = Math.random() * 6 + 1;
        
        dado2 = Math.random() * 6 + 1;
        
        numerosVilao = (int)dado1 + vilao.getPontosBizarros();
        
        numerosPersonagem = (int)dado2 + personagem.getMente();
        
        if(numerosPersonagem >= numerosVilao){
            passou = true;
        }
        else{
            passou = false;
        }
       
        return passou;  
    }
    public String rollTeste(String atributo){
        double dado;
        
        int valor;
        
        dado = Math.random() * 6 + 1;
        
        valor = (int)dado + Integer.parseInt(atributo);
        
        if(valor <= 4){
            return "Falha";
        }
        else if(valor < 7){
            return "Sucesso parcial";
        }
        else{
            return "Sucesso";
        }   
    }

}
