package saf.engine;

import java.util.ArrayList;

import saf.structure.StateRow;
import saf.util.Reader;

public class IngestData {
    private final String filePath;
    private final String type;
    private final Reader reader;

    public IngestData(String filePath, String type) {
        this.filePath = filePath;
        this.type = type;
        this.reader = new Reader(filePath, type, ',');
    }

    public String getFilePath() {
        return filePath;
    }

    public String getType() {
        return type;
    }

    public ArrayList<StateRow> parse() {
        ArrayList<StateRow> stateRows = new ArrayList<>();

        return stateRows;
    }
}
