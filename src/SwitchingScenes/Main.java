/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchingScenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Iran Freitas Ribeiro
 */
public class Main extends Application{
    Stage window; //janela que exibe as cenas
    Scene scene1,scene2; //cenas

    public static void main(String args[]){
        launch(args);
    }   
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        
        Label label1 = new Label("Bem vindo a primeira cena");
        Button button1 = new Button("Va para segunda cena");
        button1.setOnAction(e -> window.setScene(scene2));
        //Layout 1 - filhos aprensentados em uma coluna vertical
        
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1, 200, 200); 
        
        Button button2 = new Button("Que bosta de cena, volte pra cena 1");
        button2.setOnAction(e -> window.setScene(scene1));
        
        //layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);
        
        window.setScene(scene1);
        window.setTitle("Title aqui");
        window.show();
    }
    
}
