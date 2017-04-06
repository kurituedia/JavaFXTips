package optGroupComboBox.Java;

import javafx.scene.control.ListCell;

public class ComboBoxCell extends ListCell<ComboBoxOptions>{
    @Override
    protected void updateItem(ComboBoxOptions item, boolean empty) {
        super.updateItem(item, empty);
        if(empty){
            setText("");
            setGraphic(null);
        }else {
            setGraphic(null);
            if(item.isOption().equals("NOT_OPTION")) {
                setId("notOption");
                setText(item.getLabel());
                setDisable(true);
            }else{
                setId("option");
                setText(item.getLabel());
            }

        }
    }
}
