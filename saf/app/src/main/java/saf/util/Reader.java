package saf.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import saf.structure.StateRow;

public class Reader {
    private final String filepath;
    private final String type;
    private final ArrayList<StateRow> data;
    private final char delimiter;

    public Reader(String filepath, String type, char delimiter) {
        this.delimiter = delimiter;
        this.filepath = filepath;
        this.type = type;
        this.data = new ArrayList<>();
    }

    public ArrayList<StateRow> read() {
        if (this.type.equalsIgnoreCase("CSV")) {
            try (BufferedReader br = new BufferedReader(new FileReader(this.filepath))) {
                ArrayList<StateRow> rows = new ArrayList<>();
                String line;

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(String.valueOf(this.delimiter));
                    ArrayList<Double> rowData = new ArrayList<>();
                    
                    for (String value : values) {
                        rowData.add(Double.valueOf(value));
                    }

                    rows.add(new StateRow(rows.size(), rowData));
                }

                this.data.addAll(rows);

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
