package com.example.bottommenupakaji.bangunruang;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class bola extends AppCompatActivity {

    EditText editTextJariJari;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        editTextJariJari = findViewById(R.id.editText);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBola();
            }
        });
    }

    private void hitungVolumeBola() {
        String jariJariStr = editTextJariJari.getText().toString();

        if (TextUtils.isEmpty(jariJariStr) || !isNumeric(jariJariStr)) {
            textViewHasil.setText("Masukkan jari-jari yang valid");
            return;
        }

        double jariJari = Double.parseDouble(jariJariStr);
        double volume = (4.0/3.0) * Math.PI * Math.pow(jariJari, 3);
        textViewHasil.setText("Volume bola dengan jari-jari " + jariJari +
                " adalah " + volume);
    }

    private boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
