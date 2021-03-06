/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GridPane;


import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author shadows
 */
public class Main extends Application {
    Stage window;
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Teste JavaFx");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        Label nameLabel = new Label("User name: ");
        GridPane.setConstraints(nameLabel, 0, 0);
        
        //Name input
        TextField nameInput = new TextField("User");
        GridPane.setConstraints(nameInput, 1, 0);
        
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);
        
        PasswordField passInput = new PasswordField();
        passInput.setPromptText("Your password");
        GridPane.setConstraints(passInput, 1, 1);
        
        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 1, 2);
        
        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);
        
        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }    
}
