package ru.netology.core5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        File dirSrc = new File("\\Users\\sosko\\Games\\src");
        if (dirSrc.mkdir()) {
            appendTrue(result, dirSrc.getName());
        } else {
            appendFalse(result, dirSrc.getName());
        }

        File dirTest = new File("\\Users\\sosko\\Games\\src\\test");
        if (dirTest.mkdir()) {
            appendTrue(result, dirTest.getName());
        } else {
            appendFalse(result, dirTest.getName());
        }

        File dirMain = new File("\\Users\\sosko\\Games\\src\\main");
        if (dirMain.mkdir()) {
            appendTrue(result, dirMain.getName());
        } else {
            appendFalse(result, dirMain.getName());
        }
        File main = new File("\\Users\\sosko\\Games\\src\\main\\Main.java");
        File utils = new File("\\Users\\sosko\\Games\\src\\main\\Utils.java");
        try {
            if (main.createNewFile()) {
                appendTrue(result, main.getName());
            } else {
                appendFalse(result, main.getName());
            }
            if (utils.createNewFile()) {
                appendTrue(result, utils.getName());
            } else {
                appendFalse(result, utils.getName());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File dirRes = new File("\\Users\\sosko\\Games\\res");
        if (dirRes.mkdir()) {
            appendTrue(result, dirRes.getName());
        } else {
            appendFalse(result, dirRes.getName());
        }

        File dirDrawables = new File("\\Users\\sosko\\Games\\res\\drawables");
        if (dirDrawables.mkdir()) {
            appendTrue(result, dirDrawables.getName());
        } else {
            appendFalse(result, dirDrawables.getName());
        }

        File dirVectors = new File("\\Users\\sosko\\Games\\res\\vectors");
        if (dirVectors.mkdir()) {
            appendTrue(result, dirVectors.getName());
        } else {
            appendFalse(result, dirVectors.getName());
        }

        File dirIcons = new File("\\Users\\sosko\\Games\\res\\icons");
        if (dirIcons.mkdir()) {
            appendTrue(result, dirIcons.getName());
        } else {
            appendFalse(result, dirIcons.getName());
        }

        File dirSaveGames = new File("\\Users\\sosko\\Games\\savegames");
        if (dirSaveGames.mkdir()) {
            appendTrue(result, dirSaveGames.getName());
        } else {
            appendFalse(result, dirSaveGames.getName());
        }

        File dirTemp = new File("\\Users\\sosko\\Games\\temp");
        if (dirTemp.mkdir()) {
            appendTrue(result, dirTemp.getName());
        } else {
            appendFalse(result, dirTemp.getName());
        }
        File temp = new File("\\Users\\sosko\\Games\\temp\\temp.txt");
        try {
            if (temp.createNewFile()) {
                appendTrue(result, temp.getName());
            } else {
                appendFalse(result, temp.getName());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try(FileWriter fileWriter = new FileWriter(temp)) {
            String text = result.toString();
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void appendTrue(StringBuilder sb, String name) {
        sb.append(name + " создан успешно\n");
    }

    public static void appendFalse(StringBuilder sb, String name) {
        sb.append(name + " ошибка при создании\n");
    }
}
