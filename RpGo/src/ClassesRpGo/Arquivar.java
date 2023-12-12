/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesRpGo;

/**
 *
 * @author cauak
 */
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class Arquivar {

    public static boolean checkIfExists(String nome, String caminhoArquivo) {
        try {
            Path path = Paths.get(caminhoArquivo);
            if (Files.exists(path)) {
                return Files.lines(path).anyMatch(line -> line.contains(nome));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void salvarNoArquivo(String linha, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write(linha);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Personagem> lerPersonagensDoArquivo(String caminhoArquivo) {
        ArrayList<Personagem> personagens = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                boolean vilao = false;
                boolean funcionario = false;
                if(linha.split(";").length == 16){
                    vilao = true;
                }
                else if (linha.split(";").length == 15){
                    funcionario = true;
                }
                Personagem personagem = fromFileString(linha, vilao, funcionario);
                if (personagem != null) {
                    personagens.add(personagem);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personagens;
    }

    
    public static Personagem fromFileString(String fileString, boolean vilao, boolean funcionario) {
        String[] parts = fileString.split(";");
        Vilao novoVilao;
        Personagem novoPersonagem;
        // Verifique se o número de partes está correto
        if (vilao == true) {   
            String nome = parts[0];
            int corpo = Integer.parseInt(parts[1]);
            int mente = Integer.parseInt(parts[2]);
            int coragem = Integer.parseInt(parts[3]);
            int hp = Integer.parseInt(parts[4]);
            String nomeStand = parts[5];
            String poder = parts[6];
            String velocidade = parts[7];
            String durabilidade = parts[8];
            String precisao = parts[9];
            int idFuncionario = Integer.parseInt(parts[10]);
            String nomeFuncionario = parts[11];
            String DataNascimento = parts[12];
            String usuario = parts[13];
            String senha = parts[14];
            int pontosBizarros = Integer.parseInt(parts[15]);

        // Crie e retorne um novo objeto Vilao
            Pessoa dono = new Funcionario(idFuncionario, nomeFuncionario, DataNascimento, usuario, senha);
            Stand stand = new Stand(nomeStand, poder, velocidade, durabilidade, precisao);
            novoVilao = new Vilao(nome, corpo, mente, coragem, stand, dono);  // Certifique-se de ter uma referência para o dono
            novoVilao.setPontosBizarros(pontosBizarros);
            return novoVilao;
        }
        else if(funcionario){
            String nome = parts[0];
            int corpo = Integer.parseInt(parts[1]);
            int mente = Integer.parseInt(parts[2]);
            int coragem = Integer.parseInt(parts[3]);
            int hp = Integer.parseInt(parts[4]);
            String nomeStand = parts[5];
            String poder = parts[6];
            String velocidade = parts[7];
            String durabilidade = parts[8];
            String precisao = parts[9];
            int idFuncionario = Integer.parseInt(parts[10]);
            String nomeFuncionario = parts[11];
            String DataNascimento = parts[12];
            String usuario = parts[13];
            String senha = parts[14];
            
        // Crie e retorne um novo objeto Vilao
            Pessoa dono = new Funcionario(idFuncionario, nomeFuncionario, DataNascimento, usuario, senha);
            Stand stand = new Stand(nomeStand, poder, velocidade, durabilidade, precisao);
            novoPersonagem = new Personagem(nome, corpo, mente, coragem, stand, dono);
            return novoPersonagem;
        }
        else{
            String nome = parts[0];
            int corpo = Integer.parseInt(parts[1]);
            int mente = Integer.parseInt(parts[2]);
            int coragem = Integer.parseInt(parts[3]);
            int hp = Integer.parseInt(parts[4]);
            String nomeStand = parts[5];
            String poder = parts[6];
            String velocidade = parts[7];
            String durabilidade = parts[8];
            String precisao = parts[9];
            int idJogador = Integer.parseInt(parts[10]);
            String nomeJogador = parts[11];
            String DataNascimento = parts[12];
            
        // Crie e retorne um novo objeto Vilao
            Pessoa dono = new Jogador(idJogador, nomeJogador, DataNascimento );
            Stand stand = new Stand(nomeStand, poder, velocidade, durabilidade, precisao);
            novoPersonagem = new Personagem(nome, corpo, mente, coragem, stand, dono);
            return novoPersonagem;
        }
    }
}
