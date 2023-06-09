package com.paulrezzonico.renameto.view;

import com.paulrezzonico.renameto.controller.ChooseFolderController;
import com.paulrezzonico.renameto.controller.RenameController;
import javafx.scene.layout.BorderPane;

public class PaneMain extends BorderPane {

    private TopPane topPane;
    private CenterPane centerPane;

    public PaneMain() {
        this.topPane = new TopPane();
        this.topPane.getRenameButton().setOnMouseClicked(new RenameController(this));
        this.topPane.getChoiceButton().setOnMouseClicked(new ChooseFolderController(this.getTopPane()));
        this.setTop(this.topPane);

        this.centerPane = new CenterPane();
        this.setCenter(this.centerPane);
    }

    public TopPane getTopPane() {
        return topPane;
    }

    public CenterPane getCenterPane() {
        return centerPane;
    }
}

