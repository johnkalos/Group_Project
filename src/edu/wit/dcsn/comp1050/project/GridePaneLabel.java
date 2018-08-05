package application;

import java.awt.Button;
import java.awt.Insets;
import java.awt.Label;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class viewController {

    @FXML
    private GridPane matrix;
    private Label[][] label = new Label[18][18];

    public viewController() {
    }

    @FXML
    private void initialize() {

    }

    @FXML
    private void setMatrix() {
        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < label[i].length; j++) {
            	label[i][j] = new Label();
            	label[i][j].setText("1");
                matrix.add(label[i][j], i, j);
            }
        }
    }

}
