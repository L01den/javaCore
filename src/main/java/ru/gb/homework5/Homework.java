package ru.gb.homework5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Homework {
    public static void main(String[] args) throws IOException {
        copyFile();

    }

    public static void copyFile() throws IOException {
        File directory = new File("./backup");
        File file = new File(".");
        File[] files = file.listFiles();

        if (!directory.isDirectory()) {
            Files.createDirectory(Paths.get("./backup"));
        }
        int counter = 1;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                String filePath = "backup/file_" + counter + ".txt";
                File dest = new File(filePath);
                Files.copy(files[i].toPath(), dest.toPath(), REPLACE_EXISTING);
                counter++;
            }

        }
    }

}
