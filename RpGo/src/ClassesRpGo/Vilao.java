package ClassesRpGo;

import java.util.ArrayList;

public class Vilao extends Personagem {
    static public ArrayList<Vilao> listaViloes = new ArrayList();
    private int pontosBizarros; //Contar quantos personagens tem na tela e colocar como pontosBizarros
    
    public Vilao(String nome, int corpo, int mente, int coragem, Stand stand) {
        super(nome, corpo, mente, coragem, stand);
        this.pontosBizarros = 0;
    }

    public Vilao(){
        super();
        this.pontosBizarros = 0;
        
    } 

    public int getPontosBizarros() {
        return pontosBizarros;
    }

    public void setPontosBizarros(int pontosBizarros) {
        this.pontosBizarros = pontosBizarros;
    }
}
