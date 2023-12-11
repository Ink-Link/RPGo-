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

public class ArquivoPersonagens {

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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Personagem> lerPersonagensDoArquivo(String caminhoArquivo) {
        ArrayList<Personagem> personagens = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                Personagem personagem = fromFileString(linha);
                if (personagem != null) {
                    personagens.add(personagem);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personagens;
    }

    
    public static Vilao fromFileString(String fileString, boolean vilao, Pessoa dono) {
        String[] parts = fileString.split(";");

    // Verifique se o número de partes está correto
        if (vilao == true) {
            throw new IllegalArgumentException("Formato de string inválido para criar um Vilao");
            
            String nome = parts[0];
            int corpo = Integer.parseInt(parts[1]);
            int mente = Integer.parseInt(parts[2]);
            int coragem = Integer.parseInt(parts[3]);
            String nomeStand = parts[4];
            String poder = parts[5];
            String velocidade = parts[6];
            String durabilidade = parts[7];
            String precisao = parts[8];

        // Crie e retorne um novo objeto Vilao
            Stand stand = new Stand(nomeStand, poder, velocidade, durabilidade, precisao);
            Vilao novoVilao = new Vilao(nome, corpo, mente, coragem, stand, dono);  // Certifique-se de ter uma referência para o dono
        return novoVilao;
        }
        // Extraia informações das partes 
    }
}
