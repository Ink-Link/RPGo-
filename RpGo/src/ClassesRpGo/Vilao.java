package ClassesRpGo;

public class Vilao extends Personagem{
    private int pontosBizarros; //Contar quantos personagens tem na tela e colocar como pontosBizarros
    
    public Vilao(String nome, int corpo, int mente, int coragem, int hp, int plano, int determinacao, int pontosBizarros) {
        super(nome, corpo, mente, coragem, hp, plano, determinacao);
        this.pontosBizarros = pontosBizarros;
    }

    public Vilao(){
        super();
        this.pontosBizarros = 0;
    } 
}
