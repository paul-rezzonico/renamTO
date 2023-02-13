package com.paulrezzonico.renameto.view;

import javafx.scene.control.Alert;

public class NotDirectory extends Alert {

    public NotDirectory() {
        super(AlertType.ERROR);
        this.setTitle("Error");
        this.setHeaderText("Not a directory !");
        this.setContentText("Please choose a directory first !");
    }
}

