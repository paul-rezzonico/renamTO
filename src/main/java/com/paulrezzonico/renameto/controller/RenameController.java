package com.paulrezzonico.renameto.controller;

import com.paulrezzonico.renameto.model.Renamer;
import com.paulrezzonico.renameto.view.NotDirectory;
import com.paulrezzonico.renameto.view.PaneMain;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class RenameController implements EventHandler<MouseEvent> {

    private final PaneMain paneMain;

    public RenameController(PaneMain paneMain) {
        this.paneMain = paneMain;
    }

    @Override
    public void handle(MouseEvent event) {
        try {
            Renamer.rename(this.paneMain.getTopPane().getDisplayPathLabel().getText(),
                    this.paneMain.getTopPane().getNameTextField().getText(),
                    this.paneMain.getCenterPane().getOutPut(), this.paneMain.getCenterPane().getError());
        } catch (IllegalArgumentException e) {
            NotDirectory notDirectory = new NotDirectory();
            notDirectory.showAndWait();
        }
    }
}
