/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicWindow;


import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author shadows
 */
public class Main extends Application {
    Button button;
    TextField text;
    
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        
        button = new Button();
        text = new TextField();
        
        button.setText("Clicke me");
        text.setText("Campo texto");
        StackPane layout = new StackPane();
        layout.getChildren().add(0,button);
        layout.getChildren().add(1,text);
        
        Scene scene = new Scene(layout, 600, 250);
        primaryStage.setScene(scene);
        primaryStage.show();        
    }    
}
