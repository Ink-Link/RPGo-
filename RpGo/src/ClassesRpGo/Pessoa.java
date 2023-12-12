package ClassesRpGo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;  // Certifique-se de importar java.util.List

public abstract class Pessoa {
    public static int ID = 0;
    
    protected int id;
    
    protected String nome;
    
    protected String dataDeNascimento;

    public Pessoa() {
        this.id = 0;
        this.nome = "";
        this.dataDeNascimento = "";
    }

    public Pessoa(int id, String nome, String dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public abstract String toFileString();

    public static void removerPessoaDoArquivo(String chave, String caminhoArquivo, boolean removerPorUsuario) {
        try {
            List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
            List<String> novasLinhas = new ArrayList<String>();

            for (String linha : linhas) {
                String[] partes = linha.split(";");
                String chaveLinha = removerPorUsuario ? partes[3] : partes[0];

                if (!chaveLinha.equals(chave)) {
                    novasLinhas.add(linha);
                }
            }

            Files.write(Paths.get(caminhoArquivo), novasLinhas, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
