
package ClassesRpGo;

import java.util.*;

public class DadoChar {
    public int rollContestada(String statusPrincipal, String statusSecundario){
        double dado1, dado2;
        
        int valor1, valor2;
        
        dado1 = Math.random() * 6 + 1;
       
        dado2 = Math.random() * 6 + 1;
        
        valor1 = (int) dado1 + Integer.parseInt(statusPrincipal);
        
        valor2 = (int) dado2 + Integer.parseInt(statusSecundario);
        
        return (valor1 - valor2);

    }
    public int rollIniciativa(String velocidadeStand, int corpoChar){
        
        double dado;
        
        int valor = 0;
        
        switch(velocidadeStand){
            case "a":
                
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado + 5 + corpoChar;
                
                break;
            case "b":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado + 3 + corpoChar;
                
                break;
            case "c":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado + 1 + corpoChar;
                
                break;
            case "d":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado - 3 + corpoChar;
                
                break;
            case "e":
                dado = Math.random() * 6 + 1;
            
                valor = (int)dado - 5 + corpoChar;
                
                break;
            default:
                break;
        }
        
        return valor;
    }
    public boolean planoVilanesco(Vilao vilao, Personagem personagem){
        double dado1, dado2;
        
        boolean passou = false;
        
        int numerosVilao, numerosPersonagem;
        
        dado1 = Math.random() * 6 + 1;
        
        dado2 = Math.random() * 6 + 1;
        
        numerosVilao = (int)dado1 + vilao.getPontosBizarros();
        
        numerosPersonagem = (int)dado2 + personagem.getMente();
        
        if(numerosPersonagem >= numerosVilao){
            passou = true;
        }
        else{
            passou = false;
        }
       
        return passou;  
    }
    public String rollTeste(String atributo){
        double dado;
        
        int valor;
        
        dado = Math.random() * 6 + 1;
        
        valor = (int)dado + Integer.parseInt(atributo);
        
        if(valor <= 4){
            return "Falha";
        }
        else if(valor < 7){
            return "Sucesso parcial";
        }
        else{
            return "Sucesso";
        }   
    }
}    
