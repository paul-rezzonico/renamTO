package src.renameapplication.model;

import java.io.File;
import java.util.Objects;

public abstract class Rename {

    public static void RenameMethod(String path, String newName) {

        File folder = new File(path);
        if (!folder.isDirectory()){
            throw new IllegalArgumentException("Not a directory");
        }

        File[] allFiles  = folder.listFiles();
        int compt = 0;

        for(File f: Objects.requireNonNull(allFiles)) {
            compt ++;

            if(f.isFile()) {
                if (f.renameTo(new File(path+"/"+newName + compt+".png"))) {
                    System.out.println("File" + compt + "renamed successfully");
                } else {
                    System.out.println("File" + compt + "renaming failed");
                };

            }

        }
    }
}
