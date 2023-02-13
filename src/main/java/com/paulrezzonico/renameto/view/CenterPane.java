package com.paulrezzonico.renameto.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class CenterPane extends HBox {

    private Label outPut;
    private Label error;

    public CenterPane() {
        this.outPut = new Label();
        this.outPut.setPrefWidth(400);
        this.outPut.setAlignment(Pos.CENTER);
        this.outPut.setFont(Font.font("Verdana", 10));
        this.outPut.setTextFill(Color.GREEN);
        this.setMargin(this, new Insets(10, 10, 10, 10));

        this.error = new Label();
        this.error.setPrefWidth(400);
        this.error.setAlignment(Pos.CENTER);
        this.error.setFont(Font.font("Verdana", 10));
        this.error.setTextFill(Color.RED);
        this.getChildren().addAll(this.outPut, this.error);
    }

    public Label getOutPut() {
        return this.outPut;
    }

    public Label getError() {
        return this.error;
    }
}

