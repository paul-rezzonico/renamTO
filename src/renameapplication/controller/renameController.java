package src.renameapplication.controller;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import src.renameapplication.fx.PaneMain;
import src.renameapplication.fx.TopPane;
import src.renameapplication.model.Rename;

public class renameController implements EventHandler<MouseEvent> {

    private TopPane topPane;
    private Rename rename;

    public renameController(TopPane topPane) {
        this.topPane = topPane;
        this.rename = new Rename();
    }

    @Override
    public void handle(MouseEvent event) {
        try {
            rename.RenameMethod(this.topPane.getLabelPath().getText(), this.topPane.getTextFieldName().getText());
        } catch (IllegalArgumentException e) {
            System.out.println("Not a directory");
        }
    }
}
