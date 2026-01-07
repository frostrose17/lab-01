package com.example.petshop;
import java.util.Date;

public abstract class Mood {
    private Date date;

    public abstract String MoodString();

    public Date getDates() {
        return date;
    }

    public void setDates(Date dates) {
        date = dates;
    }

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date dates) {
        this.date = dates;
    }
}
