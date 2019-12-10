/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomiscontroles;

import miscontroles.MiControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class UsandoMisControles extends Application {
    
    private int cont = 0;
    
    @Override
    public void start(Stage primaryStage) {
       
        
        MiControl mcontrol = new MiControl();
        Label label = new Label();

        BorderPane root = new BorderPane();
        mcontrol.setMaxSize(100, 100);
        
        mcontrol.setOnAction(e->{
            
            label.setText("Has clickado correctamente " + cont + " veces"); 
            cont++;
        });
        
        root.setCenter(mcontrol);
        root.setBottom(label);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Usando mi control");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
