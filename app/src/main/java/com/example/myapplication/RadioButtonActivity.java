package com.example.myapplication;

import android.os.Bundle;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioButton radioButtonOption1;
    private RadioButton radioButtonOption2;
    private RadioButton radioButtonOption3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioButtonOption1 = findViewById(R.id.radioButtonOption1Id);
        radioButtonOption2 = findViewById(R.id.radioButtonOption2Id);
        radioButtonOption3 = findViewById(R.id.radioButtonOption3Id);
    }
}