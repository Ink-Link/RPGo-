package ClassesRpGo;

import java.util.ArrayList;

public class Vilao extends Personagem {
    static public ArrayList<Vilao> listaViloes = new ArrayList();
    private int pontosBizarros; // É igual à quantidade de personagens na cena
    
    public Vilao(String nome, int corpo, int mente, int coragem, Stand stand, Pessoa dono) {
        super(nome, corpo, mente, coragem, stand, dono);
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
