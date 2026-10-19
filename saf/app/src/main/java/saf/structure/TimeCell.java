package saf.structure;

public class TimeCell {
    private final int day;
    private final int month;
    private final int year;
    private final int hour;
    private final int minute;
    private final int second;
    private final int millisecond;
    private final int microsecond;

    public TimeCell(int[] args) {
        this.year = args[0];
        this.month = args[1];
        this.day = args[2];
        this.hour = args[3];
        this.minute = args[4];
        this.second = args[5];
        this.millisecond = args[6];
        this.microsecond = args[7];
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getMillisecond() {
        return millisecond;
    }

    public int getMicrosecond() {
        return microsecond;
    }
}
