/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import componentes_abrilcarlos.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class APPUsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento component1;
    @FXML
    private SelectorDeslizamiento component2;
    @FXML
    private Label result;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String> items1 = new ArrayList<>();
        ArrayList<String> items2 = new ArrayList<>();
        
        items1.add("1");
        items1.add("2");
        items1.add("3");
        
        
        items2.add("one");
        items2.add("two");
        items2.add("three");
        
        component1.setItems(items1);
        component2.setItems(items2);
        
        component1.setOnAction(e->{
            result.setText("Has pulsado el de arriba");
            result.setTextFill(Color.GREEN);
        });
        
        component2.setOnAction(e->{
            result.setText("Has pulsado el de abajo");
            result.setTextFill(Color.GREEN);
        });
        
    }    
    
}
