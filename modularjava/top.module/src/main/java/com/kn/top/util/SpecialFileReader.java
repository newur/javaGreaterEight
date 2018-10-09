package com.kn.top.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SpecialFileReader {

    public List<String> readFileLines(String path, String fileName) {
        try {
            return Files.readAllLines(Paths.get(path, fileName));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
