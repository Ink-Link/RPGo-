package ClassesRpGo;

import java.util.ArrayList;

import java.util.Date;

public class Campanha {
    private int id;
    
    private String titulo;
    
    private String sistema;
    
    private Funcionario mestre;
    
    private Date dataDeInicio;
    
    private Date proximaSessao;
    
    ArrayList <Personagem> listaDePersonagens = new ArrayList<Personagem>();
    
    public Campanha() {
        this.id = 0;
        this.titulo = "";
        this.sistema = "";
        this.mestre = new Funcionario();
        this.dataDeInicio = new Date();
        this.proximaSessao = new Date();
    }

    public Campanha(int id, String titulo, String sistema, Funcionario mestre, Date dataDeInicio, Date proximaSessao) {
        this.id = id;
        this.titulo = titulo;
        this.sistema = sistema;
        this.mestre = mestre;
        this.dataDeInicio = dataDeInicio;
        this.proximaSessao = proximaSessao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public Funcionario getMestre() {
        return mestre;
    }

    public void setMestre(Funcionario mestre) {
        this.mestre = mestre;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Date getProximaSessao() {
        return proximaSessao;
    }

    public void setProximaSessao(Date proximaSessao) {
        this.proximaSessao = proximaSessao;
    }
    
    public void modificarStat(Personagem personagem, int valor, String status){
    switch (status){
        case "hp" -> personagem.setHp(personagem.getHp() + valor);
        case "plano" -> personagem.setPlano(personagem.getPlano() - valor);
        case "determinacao" -> personagem.setPlano(personagem.getPlano() - valor);
        default -> {
            }
        }
    }
    public void pontoExtra(Personagem personagem){
        personagem.setDeterminacao(personagem.getDeterminacao() + 1);
    }
}
