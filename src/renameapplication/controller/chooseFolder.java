package src.renameapplication.controller;

import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import src.renameapplication.fx.PaneMain;

import java.io.File;
import java.util.EventListener;
import javafx.scene.input.MouseEvent;
import src.renameapplication.fx.TopPane;

public class chooseFolder implements EventHandler<MouseEvent> {

    private DirectoryChooser directoryChooser;
    private TopPane topPane;

    public chooseFolder(TopPane topPane) {
        this.directoryChooser = new DirectoryChooser();
        this.topPane = topPane;
    }

    @Override
    public void handle(MouseEvent event) {
        File directory = this.directoryChooser.showDialog(this.topPane.getScene().getWindow());

        if (directory != null) {
            this.topPane.getLabelPath().setText("");
            this.topPane.getLabelPath().setText(directory.getAbsolutePath());
        }


    }
}
