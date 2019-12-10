/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_abrilcarlos;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

public class CampoTextoNumerico extends TextField {

    public CampoTextoNumerico() throws IOException {
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TextoNumerico.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (!text.matches("[a-z, A-Z]")) {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text) {
        if (!text.matches("[a-z, A-Z]")) {
            super.replaceSelection(text);
        }
    }
};
