package main.sample.Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("main.sample.fxml"));
       // primaryStage.setTitle("Hello World");
       // primaryStage.setScene(new Scene(root, 300, 275));
       // primaryStage.show();
        ReadFile rf = new ReadFile();
        rf.ReadFile("/Users/eranedri/IdeaProjects/SearchEngine-Part1/corpus");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
