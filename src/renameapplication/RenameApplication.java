package src.renameapplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import src.renameapplication.fx.PaneMain;
import src.renameapplication.model.Rename;

public class RenameApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        PaneMain paneMain = new PaneMain();
        Scene scene = new Scene(paneMain, 800, 500);
        primaryStage.setTitle("Rename Files Application");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);

    }
}
