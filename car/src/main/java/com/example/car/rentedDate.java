package com.example.car;

public class rentedDate {

    private String start;
    private String end;

    public rentedDate() {
    }
    
    public rentedDate(String start, String end) {
        this.start = start;
        this.end = end;
    }

    
    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

}
