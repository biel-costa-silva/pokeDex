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
    //variaveis globais
    private Label poke; 
    private Pokemon pokemonEscolhido;

    @Override
    public void start(Stage stage) {            
        Database bd = new Database();
        bd.Inicialize();      
        
        poke = new Label("Hello world");        
           
        
        VBox listaDePokemons = new VBox();
        
        // lista de pokemons ----------------------------------
        for(int i=1; i <= 151; i++){
            Pokemon lacoRepeticao = bd.buscaPokemon(i);
            Button botao = new Button(lacoRepeticao.getNome());
            botao.setOnAction(e->atualizacao(lacoRepeticao));
            listaDePokemons.getChildren().add(botao);
        }        
        
        
        
        
        
        // adicionar outros elementos à cima -----------------
        
        // tela principal -------------------------------------                
        ScrollPane scrollList = new ScrollPane();
        scrollList.setContent(listaDePokemons);       
        
        HBox telaPrincipal = new HBox();
        telaPrincipal.getChildren().add(scrollList);
        telaPrincipal.getChildren().add(poke);
        
        var scene = new Scene(telaPrincipal, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    
    public void atualizacao(Pokemon p){
        poke.setText(p.getNome());
    }

    public static void main(String[] args) {
        launch();
    }

}