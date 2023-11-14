package ClassesRpGo;

public class Stand {
    private String nome;
    
    private String power;
    
    private String speed;
    
    private String dur;
    
    private String pre;

    public Stand(String nome, String power, String speed, String dur, String pre) {
        this.nome = nome;
        this.power = power;
        this.speed = speed;
        this.dur = dur;
        this.pre = pre;
    }  

    public Stand() {
        this.nome = "";
        this.power = "";
        this.speed = "";
        this.dur = "";
        this.pre = "";
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
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
