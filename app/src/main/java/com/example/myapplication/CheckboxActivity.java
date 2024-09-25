package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CheckboxActivity extends AppCompatActivity {

    private CheckBox chickenCheckBox, beefCheckBox, muttonCheckBox;
    private Button showButton;
    private TextView resultTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkbox);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        chickenCheckBox = findViewById(R.id.chickenCheckBoxId);
        beefCheckBox = findViewById(R.id.beefCheckBoxId);
        muttonCheckBox = findViewById(R.id.muttonCheckBoxId);
        showButton = findViewById(R.id.showButtonId);
        resultTextView = findViewById(R.id.resultTextViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if (chickenCheckBox.isChecked()) {
                    String value = chickenCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }
                if (beefCheckBox.isChecked()) {
                    String value = beefCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered\n");
                }
                if (muttonCheckBox.isChecked()) {
                    String value = muttonCheckBox.getText().toString();
                    stringBuilder.append(value + " is ordered ");
                }

                resultTextView.setText(stringBuilder);
            }
        });
    }
}