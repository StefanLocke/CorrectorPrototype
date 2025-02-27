package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Proto.fxml"));
        primaryStage.setTitle("Corrector GUI - ScanExam");
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.getScene().getStylesheets().add("MyStyle.css");
        primaryStage.setMinHeight(720);
        primaryStage.setMinWidth(720);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
