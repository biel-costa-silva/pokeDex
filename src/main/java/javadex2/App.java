package javadex2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import classes.Pokemon;
import database.Database;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        
        Database bd = new Database();
        bd.Inicialize();
        
        Pokemon pikachu = new Pokemon();
        pikachu = bd.buscaPokemon(25);

        var label = new Label("Pokemon: " + pikachu.getNome());
        
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}