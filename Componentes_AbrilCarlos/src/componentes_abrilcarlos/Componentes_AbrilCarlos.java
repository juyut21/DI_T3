/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_abrilcarlos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Componentes_AbrilCarlos extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        CampoTextoNumerico textoNum = new CampoTextoNumerico();
        CampoTextoBoton textoboton = new CampoTextoBoton();
        //textoboton.setText("Hello!");
        
        
        
        
        //stage.setScene(new Scene(textoboton));
        stage.setScene(new Scene(textoNum));
        stage.setTitle("Custom Control");
        stage.setWidth(100);
        stage.setHeight(100);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
