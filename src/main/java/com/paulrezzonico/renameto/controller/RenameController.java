package com.paulrezzonico.renameto.controller;

import com.paulrezzonico.renameto.model.Renamer;
import com.paulrezzonico.renameto.view.NotDirectory;
import com.paulrezzonico.renameto.view.PaneMain;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class RenameController implements EventHandler<MouseEvent> {

    private PaneMain paneMain;
    private Renamer renamer;

    public RenameController(PaneMain paneMain) {
        this.paneMain = paneMain;
        this.renamer = new Renamer();
    }

    @Override
    public void handle(MouseEvent event) {
        try {
            renamer.rename(this.paneMain.getTopPane().getDisplayPathLabel().getText(),
                    this.paneMain.getTopPane().getNameTextField().getText(),
                    this.paneMain.getCenterPane().getOutPut(), this.paneMain.getCenterPane().getError());
        } catch (IllegalArgumentException e) {
            NotDirectory notDirectory = new NotDirectory();
            notDirectory.showAndWait();
        }
    }
}
