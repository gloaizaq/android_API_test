package com.example.gloaiza.models;

/**
 * Created by gloaiza on 1/12/2017.
 */

public class Date {
    private String time;
    private long milliseconds_since_epoch;
    private String date;

    public void setDate(String date) {
        this.date = date;
    }

    public void setMilliseconds_since_epoch(long milliseconds_since_epoch) {
        this.milliseconds_since_epoch = milliseconds_since_epoch;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getMilliseconds_since_epoch() {
        return milliseconds_since_epoch;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
