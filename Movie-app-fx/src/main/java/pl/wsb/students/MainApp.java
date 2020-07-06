package pl.wsb.students;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Aplikacja do przeglądania filmów");
            primaryStage.resizableProperty().setValue(Boolean.FALSE);
            FXMLLoader loader = new
                    FXMLLoader(getClass().getClassLoader().getResource("view/login.fxml"));
            AnchorPane rootLayout = loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            launch(args);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}