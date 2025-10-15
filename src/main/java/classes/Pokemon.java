package classes;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {

    private int numero;
    private String nome;
    private List<Tipo> tipos;
    private Pokemon evoluiPara;// obejto Pokemon, que será o próximo na linha evolutiva [Pode ser nullo]
    private int evoluiEm;// É o nivel que o Pokemon passa para a próxima evolução;
    private boolean lendario;// Para especies raras de Pokemon.
    
    //----------- Construtores ------------------
    
    public Pokemon(){
    }
    
    public Pokemon(int numero, String nome, List<Tipo> tipos, Pokemon evoluiPara, int evoluiEm, boolean lendario) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
        if(evoluiPara != null){
            this.evoluiPara = new Pokemon();
            this.evoluiPara = evoluiPara;
            this.evoluiEm = evoluiEm;
        }        
        this.lendario = lendario;        
    }      
    
    //Sobrecarga do construtor
    public Pokemon(int numero, String nome, List<Tipo> tipos, boolean ehLendario) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
        this.lendario = ehLendario;        
    }   
    
    // ---------------- Numero ------------------
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // ----------------- Nome -------------------

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // ----------------- Tipo -------------------
    
    public List<Tipo> getTipos() {
        return this.tipos;
    }     
    public void setTipos(List<Tipo> tipos){        
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
    }    
    
    // -------------- EvoluiPara ----------------
    public Pokemon getEvoluiPara(){
        return this.evoluiPara;
    }
    
    public void setEvoluiPokemon(Pokemon pokemon){
        this.evoluiPara = new Pokemon();
        this.evoluiPara = pokemon;
    }
    
    // --------------- EvoluiEm -----------------
    public int getEvoluiEm(){
        return this.evoluiEm;
    }
    
    public void setEvoluiEm(int nivel){
       this.evoluiEm = nivel;
    }
    
    // -------------- isLendario ---------------    
    public boolean isLendario(){
        return this.lendario;
    }
    
    public void setLendario(boolean lendario){
        this.lendario = lendario;
    }
    
    // --------------- Fraquezas -----------------
    
    public String getTipoFraquezas(){
        String tipos = "";
        for(Tipo t: this.tipos){            
            tipos += t.getFraquezas();
        }
        return tipos;
    }
    
    // ------------- Resistencias --------------
    
     public String getTipoResistencias(){
        String tipos = "";
        for(Tipo t: this.tipos){            
            tipos += t.getResistencias();
        }
        return tipos;
    }
     
     

    
    
     
    
    @Override
    public String toString() {
        return this.nome + " - " + this.numero;
    }
}
