package com.paulrezzonico.renameto.controller;

import com.paulrezzonico.renameto.view.TopPane;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;

import java.io.File;

public class ChooseFolderController implements EventHandler<MouseEvent> {

    private DirectoryChooser directoryChooser;
    private TopPane topPane;

    public ChooseFolderController(TopPane topPane) {
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
