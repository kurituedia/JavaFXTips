package optGroupComboBox.Java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.effect.Effect;
import javafx.util.Callback;
import optGroupComboBox.Java.Enum.ComboBoxOptions;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private ComboBox<ComboBoxOptions> optGroupComboBox;

    @FXML
    private void trimLabelPosition(ActionEvent event) {
        optGroupComboBox.setId("selected");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        optGroupComboBox.setCellFactory(new Callback<ListView<ComboBoxOptions>, ListCell<ComboBoxOptions>>() {
            @Override
            public ListCell<ComboBoxOptions> call(ListView<ComboBoxOptions> param) {
                return new ListCell<ComboBoxOptions>() {
                    @Override
                    protected void updateItem(ComboBoxOptions item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setText("");
                            setGraphic(null);
                        } else {
                            setText(item.getLabel());
                            if (item.isOption().equals("NOT_OPTION")) {
                                setId("notOption");
                                setDisable(true);
                            } else {
                                setId("option");
                            }

                        }
                    }
                };
            }
        });
    }
}
