package optGroupComboBox.Java;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ComboBoxCellFactory implements Callback<ListView<ComboBoxOptions>,ListCell<ComboBoxOptions>>{
    @Override
    public ListCell<ComboBoxOptions> call(ListView<ComboBoxOptions> param) {
        return new ComboBoxCell();
    }
}
