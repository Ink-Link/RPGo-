package ClassesRpGo;

import java.util.ArrayList;

public class Jogador extends Pessoa{
    ArrayList <Personagem> listaDePersonagens = new ArrayList <Personagem>();

    public Jogador(int id, String nome, String dataDeNascimento) {
        super(id, nome, dataDeNascimento);
    }

    public Jogador() {
        super();
    }
  
    public void recebePersonagem(Personagem personagem){
        listaDePersonagens.add(personagem);   
            
    }          
}
