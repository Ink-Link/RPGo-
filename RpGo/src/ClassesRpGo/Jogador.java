package ClassesRpGo;

import static ClassesRpGo.Funcionario.fromFileString;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public static void removerPessoaDoArquivo(String identificador, String caminhoArquivo) {
    // Lógica para remover a pessoa do arquivo com base no identificador (ID)
    try {
        List<String> linhas = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;

        while ((linha = reader.readLine()) != null) {
            // Verifica se a linha começa com o identificador
            if (linha.startsWith(identificador + ";")) {
                continue; // Ignora a linha se a linha começa com o identificador
            }

            linhas.add(linha);
        }

        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));
        for (String novaLinha : linhas) {
            writer.write(novaLinha);
            writer.newLine();
        }

        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public String toFileString() {
        return getId() + ";" + getNome() + ";" + getDataDeNascimento();
    }
    public static ArrayList<Pessoa> lerJogadorDoArquivo(String caminhoArquivo) {
        ArrayList<Pessoa> jogadores = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                Jogador jogador = fromFileString(linha);
                if(jogador != null){
                    if(Pessoa.ID <= jogador.getId()){
                        Pessoa.ID = jogador.getId() + 1;
                    }
                    jogadores.add(jogador);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jogadores;
    }
    public static Jogador fromFileString(String line) {
    // Verifica se a linha não está vazia antes de processar
    if (line.isEmpty()) {
        return null; // Ou outra ação apropriada para tratar linhas vazias
    }

    String[] parts = line.split(";");
    // Verifica se há partes suficientes na linha antes de tentar converter
    if (parts.length < 3) {
        return null; // Ou outra ação apropriada para tratar linhas com formato inválido
    }

    try {
        int id = Integer.parseInt(parts[0]);
        String nome = parts[1];
        String dataDeNascimento = parts[2];
        
        return new Jogador(id, nome, dataDeNascimento);
    } catch (NumberFormatException e) {
        e.printStackTrace(); // Ou outra ação apropriada para lidar com a conversão falhada
        return null;
    }
}
}
