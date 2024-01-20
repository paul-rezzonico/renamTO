package com.paulrezzonico.renameto.model;

import javafx.scene.control.Label;

import java.io.File;
import java.util.Objects;

public class Renamer {

    private Renamer() {

    }

    public static void rename(String path, String newName, Label outPut, Label error) {

        File folder = new File(path);
        if (!folder.isDirectory()) {
            throw new IllegalArgumentException("Not a directory");
        }

        File[] allFiles = folder.listFiles();
        int compt = 0;

        outPut.setText("");
        error.setText("");

        for (File f : Objects.requireNonNull(allFiles)) {
            compt++;

            if (f.isFile()) {
                String extension = f.getName().substring(f.getName().lastIndexOf(".") + 1);
                if (f.renameTo(new File(path + "/" + newName + compt + "." + extension))) {
                    outPut.setText(outPut.getText() + "File" + compt + "renamed successfully\n");
                } else {
                    error.setText(error.getText() + "File" + compt + "renaming failed\n");
                }
            }

        }
    }
}
