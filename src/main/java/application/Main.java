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
        
        Tipo pedra = bd.buscaTipo("Pedra");        
        System.out.println(pedra.getFraquezas());
        List tipos_do_pikachu = new ArrayList<>(List.of(bd.buscaTipo("Eletrico")));
        
        /*Pokemon achado = bd.buscaPokemon(25);
        System.out.println(achado);
        */
        Pokemon raichu = new Pokemon(26, "Raichu", tipos_do_pikachu, false);        
        Pokemon pikachu = new Pokemon(25, "Pikachu", tipos_do_pikachu, raichu, 30, false);
        
        System.out.println(pikachu.getTipoFraquezas());
    }
}