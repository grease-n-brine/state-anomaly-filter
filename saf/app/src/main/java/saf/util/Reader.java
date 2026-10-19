package saf.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
    private final String filepath;
    private final String type;
    private final ArrayList<String> data;

    public Reader(String filepath, String type) {
        this.filepath = filepath;
        this.type = type;
        this.data = new ArrayList<>();
    }

    public ArrayList<String> read() {
        if (this.type.equalsIgnoreCase("CSV")) {
            try (BufferedReader br = new BufferedReader(new FileReader(this.filepath))) {
                String line;

                while ((line = br.readLine()) != null) {
                    this.data.add(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }
        return this.data;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getType() {
        return type;
    }
}
