/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandleEvents;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

/**
 *
 * @author shadows
 */
public class Main extends Application implements EventHandler<ActionEvent>{
    Button button;
    Button button1;
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Handle Events");        
        button = new Button();
        button1 = new Button();
        
        button.setText("Clicke me");
        button.setOnAction(this);
        
        button1.setText("Clicke me 2");
        button1.setOnAction(this);
        
        StackPane layout = new StackPane();
        layout.getChildren().add(0,button);
        
        Scene scene = new Scene(layout, 600, 250);
        primaryStage.setScene(scene);
        primaryStage.show();        
    }    

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("Clicou");
        }
    }
}
