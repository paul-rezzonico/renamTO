package com.paulrezzonico.renameto.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class TopPane extends VBox {

    private Label pathLabel;
    private Label displayPathLabel;
    private Button choiceButton;
    private Button renameButton;
    private final TextField nameTextField;
    private final HBox hBoxButton;
    private HBox pathHbox;

    public TopPane() {
        this.pathLabel = new Label("Folder Path :");
        this.displayPathLabel = new Label();
        this.pathLabel.setPrefWidth(300);

        this.choiceButton = new Button("Choose folder");
        this.choiceButton.setPrefWidth(100);

        this.renameButton = new Button("Rename");
        this.renameButton.setPrefWidth(100);

        this.nameTextField = new TextField();
        this.nameTextField.setPromptText("name for each images");

        this.pathHbox = new HBox(50, pathLabel, displayPathLabel);
        this.pathHbox.setPadding(new Insets(10, 10, 10, 10));
        this.pathHbox.setAlignment(Pos.CENTER);

        this.hBoxButton = new HBox(50, choiceButton, nameTextField, renameButton);
        this.hBoxButton.setPadding(new Insets(10, 10, 10, 10));
        this.hBoxButton.setAlignment(Pos.CENTER);

        this.setSpacing(50);
        this.getChildren().addAll(this.pathHbox, this.hBoxButton);
        this.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public Label getPathLabel() {
        return this.pathLabel;
    }

    public void setPathLabel(Label pathLabel) {
        this.pathLabel = pathLabel;
    }

    public Label getDisplayPathLabel() {
        return displayPathLabel;
    }

    public void setDisplayPathLabel(Label displayPathLabel) {
        this.displayPathLabel = displayPathLabel;
    }

    public Button getChoiceButton() {
        return choiceButton;
    }

    public void setChoiceButton(Button choiceButton) {
        this.choiceButton = choiceButton;
    }

    public HBox getPathHbox() {
        return pathHbox;
    }

    public void setPathHbox(HBox pathHbox) {
        this.pathHbox = pathHbox;
    }

    public Button getRenameButton() {
        return renameButton;
    }

    public void setRenameButton(Button renameButton) {
        this.renameButton = renameButton;
    }

    public TextField getNameTextField() {
        return this.nameTextField;
    }

    public HBox gethBoxButton() {
        return hBoxButton;
    }
}

