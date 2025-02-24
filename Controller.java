import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller {

    @FXML
    private Pane RoomsPane;

    @FXML
    private Pane StaffPane;

    @FXML
    private Pane GuestsPane;

    @FXML
    private Button roomsButton;

    @FXML
    private Button staffButton;

    @FXML
    private Button guestsButton;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    void RoomsButtonSelected(ActionEvent event) {
        RoomsPane.setVisible(true);
        GuestsPane.setVisible(false);
        StaffPane.setVisible(false);
    }

    @FXML
    void roomsButton(ActionEvent event) {

    }

    @FXML
    void GuestsButtonSelected(ActionEvent event) {
        GuestsPane.setVisible(true);
        RoomsPane.setVisible(false);
        StaffPane.setVisible(false);

    }

    @FXML
    void guestsButton(ActionEvent event) {

    }

    @FXML
    void StaffButtonSelected(ActionEvent event) {
        StaffPane.setVisible(true);
        RoomsPane.setVisible(false);
        GuestsPane.setVisible(false);
    }

    @FXML
    void staffButton(ActionEvent event) {

    }

}
