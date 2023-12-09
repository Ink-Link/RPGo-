package ClassesRpGo;

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
    
}
