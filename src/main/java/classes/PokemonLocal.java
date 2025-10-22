package classes;

public class PokemonLocal {
    
    private String nome;
    private Pokemon especie;
    private int nivel;//(inicia em 1)
    private float peso;
    private int altura;// em cm
    private int vida;
    
    // -------- Construtor padrão (com os atributos obrigatórios)
    
    public PokemonLocal(Pokemon especie, float peso, int altura, int vida){
        
        this.especie = especie;
        this.peso = peso;
        this.altura = altura;
        this.vida = vida;        
        this.nome = especie.getNome();
        
        this.nivel = 1;
    }
    
    // ----------------------------------------------------------
    public PokemonLocal(String nome, Pokemon especie, float peso, int altura, int vida){
        
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.altura = altura;
        this.vida = vida;    
        
        this.nivel = 1;
    }
}
