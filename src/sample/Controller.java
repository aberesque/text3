package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button btnButton;
    public Label lblLabel;
    public Model model;

    public void doThing(ActionEvent actionEvent) {
        model.increment();
        lblLabel fx:text = model.getCount();
    }
}
