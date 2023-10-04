package andrewkoval.jewellerystore;

import andrewkoval.jewellerystore.ADT.DisplayCaseLinkedList;
import andrewkoval.jewellerystore.ADT.DisplayTrayLinkedList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Driver extends Application {


    public static DisplayCaseLinkedList cases = new DisplayCaseLinkedList();


    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("view2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1193, 836);
        stage.setTitle("Jewellery Store");




        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }




}
