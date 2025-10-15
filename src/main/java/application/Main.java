package application;


import database.Database;
import classes.Pokemon;
import classes.Tipo;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Pokemon persian = new Pokemon(053, "Persian", "Normal", 90, 32, 100, false);
        Database bd = new Database();
        bd.Inicialize();
                
        Tipo eletrico = bd.buscaTipo("Eletrico");
        List tipos_do_pokemon = new ArrayList<>(List.of(eletrico));
        
        Pokemon raichu = new Pokemon(26, "Raichu", tipos_do_pokemon, false);        
        Pokemon pikachu = new Pokemon(25, "Pikachu", tipos_do_pokemon, raichu, 25, false);
        Pokemon diglett = bd.buscaPokemon("Diglett");
        
        System.out.println(diglett.getEvoluiPara().getNome());
    }
}