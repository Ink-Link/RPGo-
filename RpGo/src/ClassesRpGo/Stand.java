package ClassesRpGo;

import java.util.ArrayList;

public class Stand {
    private String nome;
    
    private String pwr;
    
    private String spd;
    
    private String dur;
    
    private String pre;

    public Stand(String nome, String pwr, String spd, String dur, String pre) {
        this.nome = nome;
        this.pwr = pwr;
        this.spd = spd;
        this.dur = dur;
        this.pre = pre;
    }  

    public Stand() {
        this.nome = "";
        this.pwr = "";
        this.spd = "";
        this.dur = "";
        this.pre = "";
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPwr() {
        return pwr;
    }

    public void setPwr(String pwr) {
        this.pwr = pwr;
    }

    public String getSpd() {
        return spd;
    }

    public void setSpeed(String spd) {
        this.spd = spd;
    }

    public String getDur() {
        return dur;
    }

    public void setDur(String dur) {
        this.dur = dur;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }
    
    public int rollTesteInt(String atributo) {
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
        return valor1;
    }
    
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
            return (Integer.toString(valor1) + " (Falha)\n");
        }
        else if(valor1 < 7){
            return (Integer.toString(valor1) + " (Sucesso parcial)\n");
        }
        else{
            return (Integer.toString(valor1) + " (Sucesso)\n");
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
