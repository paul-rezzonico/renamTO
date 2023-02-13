package com.paulrezzonico.renameto;

import com.paulrezzonico.renameto.view.PaneMain;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class RenameTO extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        PaneMain paneMain = new PaneMain();
        Scene scene = new Scene(paneMain, 800, 500);
        primaryStage.setTitle("Rename Files Application");
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/icon.png"))));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
