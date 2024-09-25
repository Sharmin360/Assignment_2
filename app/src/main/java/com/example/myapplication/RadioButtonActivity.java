package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioButton radioButtonOption1;
    private RadioButton radioButtonOption2;
    private RadioButton radioButtonOption3;

    private Button radioshowButton;
    private TextView radioresultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioButtonOption1 = findViewById(R.id.radioButtonOption1Id);
        radioButtonOption2 = findViewById(R.id.radioButtonOption2Id);
        radioButtonOption3 = findViewById(R.id.radioButtonOption3Id);
        radioshowButton = findViewById(R.id.RadioshowButtonId);
        radioresultTextView = findViewById(R.id.RadioresultTextViewId);

        radioshowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButtonOption1.isChecked()) {
                    radioresultTextView.setText("Option 1 selected");
                } else if (radioButtonOption2.isChecked()) {
                    radioresultTextView.setText("Option 2 selected");
                } else if (radioButtonOption3.isChecked()) {
                    radioresultTextView.setText("Option 3 selected");
                } else {
                    radioresultTextView.setText("No radio selected");
                }
            }
        });
    }
}