package src.renameapplication.fx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import src.renameapplication.controller.chooseFolder;
import src.renameapplication.controller.renameController;

public class TopPane extends VBox {

    private Label labelInfo;
    private Label labelPath;
    private Button buttonChoose;
    private Button buttonRename;
    private TextField textFieldName;
    private HBox hBoxButton;
    private HBox hBoxInfo;

    public TopPane() {
        this.labelInfo = new Label("Rentrer le chemin du dossier :");
        this.labelPath = new Label();
        this.labelInfo.setPrefWidth(300);

        this.buttonChoose = new Button("Choose folder");
        this.buttonChoose.setOnMouseClicked(new chooseFolder(this));
        this.buttonRename = new Button("Rename");
        this.buttonRename.setOnMouseClicked(new renameController(this));

        this.textFieldName = new TextField();
        this.textFieldName.setPromptText("name for each images");

        this.hBoxInfo = new HBox(50, labelInfo, labelPath);
        this.hBoxInfo.setPadding(new Insets(10, 10, 10, 10));
        this.hBoxInfo.setAlignment(Pos.CENTER);

        this.hBoxButton = new HBox(50, buttonChoose, buttonRename  , textFieldName);
        this.hBoxButton.setPadding(new Insets(10, 10, 10, 10));
        this.hBoxButton.setAlignment(Pos.CENTER);

        this.setSpacing(50);
        this.getChildren().addAll(this.hBoxInfo, this.hBoxButton);
        this.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public Label getLabelInfo() {
        return this.labelInfo;
    }

    public void setLabelInfo(Label labelInfo) {
        this.labelInfo = labelInfo;
    }

    public Label getLabelPath() {
        return labelPath;
    }

    public void setLabelPath(Label labelPath) {
        this.labelPath = labelPath;
    }

    public Button getButtonChoose() {
        return buttonChoose;
    }

    public void setButtonChoose(Button buttonChoose) {
        this.buttonChoose = buttonChoose;
    }

    public HBox gethBoxInfo() {
        return hBoxInfo;
    }

    public void sethBoxInfo(HBox hBoxInfo) {
        this.hBoxInfo = hBoxInfo;
    }

    public Button getButtonRename() {
        return buttonRename;
    }

    public void setButtonRename(Button buttonRename) {
        this.buttonRename = buttonRename;
    }

    public TextField getTextFieldName() {
        return this.textFieldName;
    }

    public HBox gethBoxButton() {
        return hBoxButton;
    }
}
