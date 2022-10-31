package src.renameapplication.controller;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import src.renameapplication.fx.PaneMain;
import src.renameapplication.model.Rename;

public class renameController implements EventHandler<MouseEvent> {

    private PaneMain paneMain;
    private Rename rename;

    public renameController(PaneMain paneMain) {
        this.paneMain = paneMain;
        this.rename = new Rename();
        TextField textField = this.paneMain.getTextFieldName();
    }

    @Override
    public void handle(MouseEvent event) {
        try {
            rename.RenameMethod(this.paneMain.getLabelPath().getText(), "hrhhr");
        } catch (IllegalArgumentException e) {
            System.out.println("Not a directory");
        }
    }
}
