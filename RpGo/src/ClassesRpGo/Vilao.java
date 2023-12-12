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
    
    public String toFileString(){
        return this.nome + ";" + Integer.toString(this.corpo) + ";" + Integer.toString(this.mente)  + ";" + 
                Integer.toString(this.coragem)  + ";" + Integer.toString(this.hp) + ";" + 
                this.stand.toFileString() + ";" + this.dono.toFileString() + ";" + this.pontosBizarros; 
    }
    
    public int getPontosBizarros() {
        return pontosBizarros;
    }

    public void setPontosBizarros(int pontosBizarros) {
        this.pontosBizarros = pontosBizarros;
    }
}
