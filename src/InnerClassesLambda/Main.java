/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClassesLambda;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;

/**
 *
 * @author shadows
 */
public class Main extends Application{
    Button button;
    Button button1;
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Um bom nome");        
        button = new Button();
        button1 = new Button();
        
        button.setText("Não clique");
        button.setOnAction(e -> System.out.println("E ae po?"));  
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 600, 250);
        primaryStage.setScene(scene);
        primaryStage.show();        
    }
}
