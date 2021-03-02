package com.example.ampersandbox;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class Amp {
    // Store the id of the  movie poster
    private int dial1Value;

    // Constructor that is used to create an instance of the Amp object
    public Amp(int dial1Value) {
        this.dial1Value = dial1Value;
    }

    public int getDial1Value() {
        return this.dial1Value;
    }

    public void setDial1Value(int dial1Value) {
        this.dial1Value = dial1Value;
    }
}
