import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Controller {

    @FXML
    private Button roomsButton;

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
        roomsButton.setStyle("-fx-background-color: #ff5733;"); // Change button color to orange-red
    }

    @FXML
    void roomsButton(ActionEvent event) {
        roomsButton.setStyle("-fx-background-color: #ff5733;"); // Change button color to orange-red

    }

    @FXML
    void GuestsButtonSelected(ActionEvent event) {

    }

    @FXML
    void guestsButton(ActionEvent event) {

    }

    @FXML
    void StaffButtonSelected(ActionEvent event) {

    }

    @FXML
    void staffButton(ActionEvent event) {

    }

}
