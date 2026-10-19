package saf.engine;

public class IngestData {
    private final String filePath;
    private final String type;

    public IngestData(String filePath, String type) {
        this.filePath = filePath;
        this.type = type;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getType() {
        return type;
    }
}
