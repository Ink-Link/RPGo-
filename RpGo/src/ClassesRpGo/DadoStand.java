package ClassesRpGo;

import java.util.ArrayList;

public class DadoStand{
    public String rollTeste(String atributo){
        double dado1, dado2, dado3;
        
        int valor1 = 0;
        
        ArrayList <Integer> valores = new ArrayList <Integer>(); 
        
        switch (atributo){
        case "A":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            dado3 = Math.random() * 6 + 1;
            
            valor1 = (int)dado1 + (int) dado2 + (int) dado3; 
            
            break;
        case "B":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            dado3 = Math.random() * 6 + 1;
            
            valores.add((int)dado1);
            
            valores.add((int)dado2);
            
            valores.add((int)dado3);
            
            valores.sort(null);
            
            valor1 = valores.get(1) + valores.get(2);
            
            break;
            
        case "C":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            valor1 = (int)dado1 + (int) dado2;
            
            break;            
        case "D":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            valores.add((int)dado1);
            
            valores.add((int)dado2);
            
            valores.sort(null);
            
            valor1 = valores.get(1);
            
            break;
            
        case "E":
            dado1 = Math.random() * 6 + 1;
            
            valor1 = (int)dado1;
            
            break;
        
        default:
            break;
        }
        if(valor1 <= 4){
            return "Falha";
        }
        else if(valor1 < 7){
            return "Sucesso parcial";
        }
        else{
            return "Sucesso";
        }
    }
        
    public int rollContestada(String statusPrincipal, String statusSecundario){
        double dado1, dado2, dado3;
        
        int valor1 = 0, valor2 = 0;
        
        ArrayList <Integer> valores = new ArrayList <Integer>(); 
        
        switch (statusPrincipal){
        case "A":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            dado3 = Math.random() * 6 + 1;
            
            valor1 = (int)dado1 + (int) dado2 + (int) dado3; 
            
            break;
        case "B":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            dado3 = Math.random() * 6 + 1;
            
            valores.add((int)dado1);
            
            valores.add((int)dado2);
            
            valores.add((int)dado3);
            
            valores.sort(null);
            
            valor1 = valores.get(1) + valores.get(2);
            
            break;
            
        case "C":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            valor1 = (int)dado1 + (int) dado2;
            
            break;            
        case "D":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            valores.add((int)dado1);
            
            valores.add((int)dado2);
            
            valores.sort(null);
            
            valor1 = valores.get(1);
            
            break;
            
        case "E":
            dado1 = Math.random() * 6 + 1;
            
            valor1 = (int)dado1;
            
            break;
        
        default:
            break;
        }    
            
        switch(statusSecundario){
        case "A":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            dado3 = Math.random() * 6 + 1;
            
            valor2 = (int)dado1 + (int) dado2 + (int) dado3; 
            
            break;
        case "B":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            dado3 = Math.random() * 6 + 1;
            
            valores.add((int)dado1);
            
            valores.add((int)dado2);
            
            valores.add((int)dado3);
            
            valores.sort(null);
            
            valor2 = valores.get(1) + valores.get(2);
            
            break;
            
        case "C":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            valor2 = (int)dado1 + (int) dado2;
            
            break;            
        case "D":
            dado1 = Math.random() * 6 + 1;
       
            dado2 = Math.random() * 6 + 1;
            
            valores.add((int)dado1);
            
            valores.add((int)dado2);
            
            valores.sort(null);
            
            valor2 = valores.get(1);
            
            break;
            
        case "E":
            dado1 = Math.random() * 6 + 1;
            
            valor2 = (int)dado1;
            
            break;
        
        default:
            break;
        }
        
        return (valor1 - valor2);
    }

}    
