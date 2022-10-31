package src.renameapplication.fx;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import src.renameapplication.controller.chooseFolder;
import src.renameapplication.controller.renameController;

public class PaneMain extends BorderPane {

    private Label labelInfo;
    private Label labelPath;
    private Button buttonChoose;
    private Button buttonRename;
    private TextField textFieldName;
    private VBox vBox;
    private HBox hBoxButton;
    private HBox hBoxInfo;

    public PaneMain() {
        this.labelInfo = new Label("Rentrer le chemin du dossier :");
        this.labelPath = new Label();

        this.buttonChoose = new Button("Choose folder");
        this.buttonChoose.setOnMouseClicked(new chooseFolder(this));
        this.buttonRename = new Button("Rename");
        this.buttonRename.setOnMouseClicked(new renameController(this));

        this.textFieldName = new TextField();
        this.textFieldName.setPromptText("Enter the new name for each images");

        this.hBoxInfo = new HBox(50, labelInfo, labelPath);
        this.hBoxInfo.setPadding(new Insets(10, 10, 10, 10));

        this.hBoxButton = new HBox(50, buttonChoose, buttonRename  , textFieldName);
        this.vBox = new VBox(50, this.hBoxInfo, this.hBoxButton);
        this.vBox.setMargin(this, new Insets(50, 50, 50, 50));

        this.setTop(vBox);

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

    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
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
