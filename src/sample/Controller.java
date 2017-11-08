package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
   
    public TextField textfield2;
    public TextField textfield1;
    public Label label;


    public void handleClick(ActionEvent actionEvent) {

        label.setText(sklej(textfield1.getText(), textfield2.getText()));

    }

    private String sklej(String napis1, String napis2) {
        if (napis1 != null && napis2 != null) {
            return napis1 + napis2;
        }else if (napis1 != null) {
            return napis1;
        }
        else if (napis2 != null){
            return napis2;
        }
        else return "";
    }
}

