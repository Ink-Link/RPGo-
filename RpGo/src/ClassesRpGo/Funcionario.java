package ClassesRpGo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private String usuario;
    
    private String senha;

    public Funcionario() {
        super();
        this.usuario = "";
        this.senha = "";
    }

    public Funcionario(int id, String nome, String dataDeNascimento, String usuario, String senha) {
        super(id, nome, dataDeNascimento);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public static ArrayList<Pessoa> lerFuncionariosDoArquivo(String caminhoArquivo) {
        ArrayList<Pessoa> funcionarios = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                Funcionario funcionario = fromFileString(linha);
                if(funcionario != null){
                    if(Pessoa.ID <= funcionario.getId()){
                        Pessoa.ID = funcionario.getId() + 1;
                    }
                    funcionarios.add(funcionario);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }
    public String toFileString() {
        return getId() + ";" + getNome() + ";" + getDataDeNascimento() + ";" + usuario + ";" + senha;
    }

    // Método para criar um Funcionario a partir de uma string lida do arquivo
    public static Funcionario fromFileString(String line) {
    // Verifica se a linha não está vazia antes de processar
    if (line.isEmpty()) {
        return null; // Ou outra ação apropriada para tratar linhas vazias
    }

    String[] parts = line.split(";");
    // Verifica se há partes suficientes na linha antes de tentar converter
    if (parts.length < 5) {
        return null; // Ou outra ação apropriada para tratar linhas com formato inválido
    }

    try {
        int id = Integer.parseInt(parts[0]);
        String nome = parts[1];
        String dataDeNascimento = parts[2];
        String usuario = parts[3];
        String senha = parts[4];

        return new Funcionario(id, nome, dataDeNascimento, usuario, senha);
    } catch (NumberFormatException e) {
        e.printStackTrace(); // Ou outra ação apropriada para lidar com a conversão falhada
        return null;
    }
}
    public static void removerPessoaDoArquivo(String id, String caminhoArquivo, boolean removerPorUsuario) {
    List<String> linhas = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
        String linha;

        while ((linha = reader.readLine()) != null) {
            Funcionario funcionario = fromFileString(linha);

            // Verifica se o ID é diferente do ID que estamos tentando remover
            // ou se estamos removendo por usuário e o usuário não corresponde.
            if (funcionario != null && !String.valueOf(funcionario.getId()).equals(id)
                    && (!removerPorUsuario || !funcionario.getUsuario().equals(id))) {
                linhas.add(linha);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Reescreve o arquivo com as linhas restantes
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        for (String linha : linhas) {
            writer.write(linha);
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
