package javadex2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import classes.Pokemon;
import database.Database;
import java.util.List;


/**
 * JavaFX App
 */
public class App extends Application {
    
    private Label label2;
    private List<Pokemon> pokemons;
    private Pokemon pokemonEscolhido;

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        
        Database bd = new Database();
        bd.Inicialize();
        pokemons = bd.pokemons;
        label2 = new Label("Hello world");        
        
        Pokemon pikachu = new Pokemon();
        Pokemon raichu = new Pokemon();
        
        pikachu = bd.buscaPokemon(25);
        raichu = bd.buscaPokemon(26);
        
        
        
        Button Pikachu = new Button(bd.buscaPokemon(25).getNome());// botao
        Pikachu.setOnAction(e -> atualizacao());
        var Raichu = new Label(raichu.getNome());
        
        StackPane pilha = new StackPane();
        ScrollPane tela = new ScrollPane();
        
        // lista de pokemons ----------------------------------
        VBox listaDePokemons = new VBox();
        for(int i=1; i <= 151; i++){
            listaDePokemons.getChildren().add(new Button(bd.buscaPokemon(i).getNome()));
        }
        // ----------------------------------------------------
        
        
        tela.setContent(listaDePokemons);
       
        
        var scene = new Scene(tela, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    
    public void atualizacao(){
        label2 = new Label("Atualizei");
    }

    public static void main(String[] args) {
        launch();
    }

}