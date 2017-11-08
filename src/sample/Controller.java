package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {

    public RadioButton radioButton;
    public Label label;
    @FXML
    private RadioButton ananas;
    @FXML
    private RadioButton banan;
    @FXML
    private RadioButton truskawka;

    public void handleClick(ActionEvent actionEvent) {
        if (ananas.isSelected())
            label.setText(ananas.getText());
        if (banan.isSelected())
            label.setText(banan.getText());
        if (truskawka.isSelected())
            label.setText(truskawka.getText());
    }
}
