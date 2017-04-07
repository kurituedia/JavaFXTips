package optGroupComboBox.Java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/optGroupComboBox/fxml/OptGroupComboBox.fxml"));
        Scene root = new Scene(anchorPane);
        primaryStage.setTitle("optgroupComboBox");
        root.getStylesheets().add(getClass().getResource("/optGroupComboBox/css/optGroup.css").toString());
        primaryStage.setScene(root);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
