package classes;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {

    private int numero;
    private String nome;
    private List<Tipo> tipos;
    private int vida;
    private float peso;
    private float altura;
    private boolean evolui;
    
    //----------- Construtores ------------------

    public Pokemon(int numero, String nome, List<Tipo> tipos, int vida, float peso, float altura, boolean evolui) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
        this.vida = vida;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
    }      
    
    public Pokemon() {

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
    
    // ---------------- Tipo ------------------
    
    public List<Tipo> getTipos() {
        return this.tipos;
    }     
    public void setTipos(List<Tipo> tipos){        
        this.tipos = new ArrayList();
        for(Tipo t: tipos){
            this.tipos.add(t);
        }
    }
    
    // ---------------- Vida ------------------
    
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    // ---------------- Peso ------------------
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    // ---------------- Altura ------------------
    
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    // ---------------- Evolui ------------------
    
    public boolean isEvolui() {
        return evolui;
    }
    public void setEvolui(boolean evolui) {
        this.evolui = evolui;
    }
    
    // ---------------- Fraquezas ------------------
    
    public String getTipoFraquezas(){
        String tipos = "";
        for(Tipo t: this.tipos){            
            tipos += t.getFraquezas();
        }
        return tipos;
    }
    
    // ---------------- Resistencias ------------------
    
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
