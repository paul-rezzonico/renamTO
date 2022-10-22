package src.renameapplication.fx;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class PaneMain extends BorderPane {

    private Label label;
    private Button button;
    private VBox vBox;
    private FileChooser fileChooser;

    public PaneMain() {
        this.label = new Label("Rentrer le chemin du dossier :");
        this.label.setPadding(new Insets(10, 10, 10, 10));
        this.fileChooser = new FileChooser();
        this.fileChooser.setTitle("Open folder");
        this.button = new Button("Rename");
        this.vBox = new VBox(50, label, button);
        this.vBox.setMargin(this, new Insets(50, 50, 50, 50));

        this.setTop(label);

    }

}
