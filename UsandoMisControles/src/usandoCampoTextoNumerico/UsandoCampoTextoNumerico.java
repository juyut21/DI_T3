/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandoCampoTextoNumerico;

import componentes_abrilcarlos.CampoTextoNumerico;
import componentes_abrilcarlos.SelectorDeslizamiento;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class UsandoCampoTextoNumerico extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        SelectorDeslizamiento textoNum = new SelectorDeslizamiento();
        VBox caja = new VBox();
        //textoboton.setText("Hello!");
        
        caja.getChildren().add(textoNum);
 
        //stage.setScene(new Scene(textoboton));
        stage.setScene(new Scene(caja));
        stage.setTitle("Custom Control");
        stage.setWidth(200);
        stage.setHeight(200);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}