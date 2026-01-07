package com.example.petshop;
import java.util.Date;

public class Sad extends Mood{

    public Sad() {
        super();
    }

    public Sad(Date dates) {
        super(dates);
    }


    @Override
    public String MoodString() {
        return "I am sad";
    }
}
