package optGroupComboBox.Java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    AnchorPane anchorPane;

    @FXML
    private ComboBox<Integer> manaCosts;

    @FXML
    private ComboBox<ComboBoxOptions> cardSets;

    @FXML
    private void trim(ActionEvent event){
        cardSets.setId("selected");
    }

}
