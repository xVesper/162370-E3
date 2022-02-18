package com.company;

import java.io.File;
import java.util.List;

public class Main {
    public static String[] DirectoryList(String path, String ex) {
        String[] result = {};
        try {
            File f = new File(path);
            result = f.list((dir, name) -> dir.isDirectory() && !name.endsWith(ex));
            if (result != null) {
                for (String file : result) {
                    System.out.print(file + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        List.of(DirectoryList("src/", ".txt"));
    }
}