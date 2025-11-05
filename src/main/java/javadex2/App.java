package javadex2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import classes.Pokemon;
import database.Database;
import java.util.List;

/**
 * JavaFX App
 */
public class App extends Application {
    //variaveis globais
    private Label poke; 
    private Label tipos;
    private Label evolucao;
    private Pokemon pokemonEscolhido;

    @Override
    public void start(Stage stage) {            
        Database bd = new Database();
        bd.Inicialize();      
        
        poke = new Label("00 - Tela inicial");      
        tipos = new Label("Tipos vem aqui");
        evolucao = new Label("Evolucao vem aqui");
        
           
        
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
        
        Image obj = new Image(getClass().getResourceAsStream("/image/025.png"));
        ImageView iv = new ImageView(obj);
        iv.setFitWidth(200);
        iv.setPreserveRatio(true);
        
        HBox telaPrincipal = new HBox();
        VBox apresentacao = new VBox();
        telaPrincipal.getChildren().add(scrollList);
                
        
        apresentacao.getChildren().add(poke);
        apresentacao.getChildren().add(iv);
        
        HBox informacoes = new HBox();
        VBox tela_tipos = new VBox();
        tela_tipos.getChildren().add(tipos);
        
        VBox tela_evolucao = new VBox();
        tela_evolucao.getChildren().add(evolucao);
        
        
        informacoes.getChildren().add(tela_tipos);
        informacoes.getChildren().add(tela_evolucao);
        
        apresentacao.getChildren().add(informacoes);
        telaPrincipal.getChildren().add(apresentacao);
        
        var scene = new Scene(telaPrincipal, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    
    public void atualizacao(Pokemon p){
        poke.setText(p.getNumero() + "- " + p.getNome());
        tipos.setText(p.getTipoFraquezas());
        evolucao.setText(p.getEvoluiPara().getNome());
    }

    public static void main(String[] args) {
        launch();
    }

}