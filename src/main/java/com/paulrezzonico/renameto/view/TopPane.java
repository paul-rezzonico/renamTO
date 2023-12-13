package com.paulrezzonico.renameto.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class TopPane extends VBox {

    private final Label displayPathLabel;
    private final Button choiceButton;
    private final Button renameButton;
    private final TextField nameTextField;

    public TopPane() {
        Label pathLabel = new Label("Folder Path :");
        this.displayPathLabel = new Label();
        pathLabel.setPrefWidth(300);

        this.choiceButton = new Button("Choose folder");
        this.choiceButton.setPrefWidth(100);

        this.renameButton = new Button("Rename");
        this.renameButton.setPrefWidth(100);

        this.nameTextField = new TextField();
        this.nameTextField.setPromptText("name for each images");

        HBox pathHbox = new HBox(50, pathLabel, displayPathLabel);
        pathHbox.setPadding(new Insets(10, 10, 10, 10));
        pathHbox.setAlignment(Pos.CENTER);

        HBox hBoxButton = new HBox(50, choiceButton, nameTextField, renameButton);
        hBoxButton.setPadding(new Insets(10, 10, 10, 10));
        hBoxButton.setAlignment(Pos.CENTER);

        this.setSpacing(50);
        this.getChildren().addAll(pathHbox, hBoxButton);
        this.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public Label getDisplayPathLabel() {
        return displayPathLabel;
    }

    public Button getChoiceButton() {
        return choiceButton;
    }

    public Button getRenameButton() {
        return renameButton;
    }

    public TextField getNameTextField() {
        return this.nameTextField;
    }

}
