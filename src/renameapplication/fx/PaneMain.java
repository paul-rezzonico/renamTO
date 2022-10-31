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

public class PaneMain extends BorderPane {

    private TopPane topPane;

    public PaneMain() {
        this.topPane = new TopPane();
        this.setTop(this.topPane);
    }
}
