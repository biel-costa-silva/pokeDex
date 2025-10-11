package classes;
import java.util.List;
import java.util.ArrayList;

public class Tipo {

    private String nome;
    private List<Tipo> fraquezas;
    private List<Tipo> resistencias;
    
    //------------- Construtores -------------

    public Tipo(String nome){        
        this.nome = nome;
    }

    public Tipo(String nome, Tipo fraqueza, Tipo resistencia){             
        this.nome = nome;
        this.fraquezas = new ArrayList();
        this.fraquezas.add(fraqueza);
        
        this.resistencias = new ArrayList();
        this.resistencias.add(resistencia);
    }
        
    // ---------------- Nome ------------------

    public String getNome() {
        return nome;
    }
    
    // ------------- Fraquezas ----------------
    
    public void setFraquezas(List<Tipo> fraquezas){
        this.fraquezas = new ArrayList();
    
        for(Tipo t: fraquezas){
            this.fraquezas.add(t);
        }
    }
    public void addFraquezas(List<Tipo> fraquezas){
        for(Tipo t: fraquezas){
            this.fraquezas.add(t);
        }
    }
    
    public String getFraquezas(){
        String fraquezas = "";
        for(Tipo t: this.fraquezas){
            fraquezas += t.getNome() + " ";
        }
        return fraquezas;
    }
    
   // ------------- Resistencias ---------------
    
    public void setResistencias(List<Tipo> resistencias){
        this.resistencias = new ArrayList();
    
        for(Tipo t: resistencias){
            this.resistencias.add(t);
        }
    }
    public void addResistencias(List<Tipo> resistencias){
        for(Tipo t: resistencias){
            this.resistencias.add(t);
        }
    }    
    public String getResistencias(){
        String resistencias = "";
        for(Tipo t: this.resistencias){
            resistencias += t.getNome() + " ";
        }
        return resistencias;
    }

}
