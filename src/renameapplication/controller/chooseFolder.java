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

public class chooseFolder implements EventHandler<MouseEvent> {

    private DirectoryChooser directoryChooser;
    private PaneMain paneMain;

    public chooseFolder(PaneMain paneMain) {
        this.directoryChooser = new DirectoryChooser();
        this.paneMain = paneMain;
    }

    @Override
    public void handle(MouseEvent event) {
        File directory = this.directoryChooser.showDialog(paneMain.getScene().getWindow());

        if (directory != null) {
            this.paneMain.getLabelPath().setText("");
            this.paneMain.getLabelPath().setText(directory.getAbsolutePath());
        }


    }
}
