package com.example.petshop;
import java.util.Date;

public class Happy extends Mood {
    public Happy() {
        super();
    }

    public Happy(Date dates) {
        super(dates);
    }

    @Override
    public String MoodString() {
        return "I am happy";
    }
}
