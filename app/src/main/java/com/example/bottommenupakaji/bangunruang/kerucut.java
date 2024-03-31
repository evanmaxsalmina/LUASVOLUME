package com.example.bottommenupakaji.bangunruang;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class kerucut extends AppCompatActivity {

    EditText editTextJariJari, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        editTextJariJari = findViewById(R.id.editText);
        editTextTinggi = findViewById(R.id.editText1);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKerucut();
            }
        });
    }

    private void hitungVolumeKerucut() {
        String jariJariStr = editTextJariJari.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        if (TextUtils.isEmpty(jariJariStr) || TextUtils.isEmpty(tinggiStr) ||
                !isNumeric(jariJariStr) || !isNumeric(tinggiStr)) {
            textViewHasil.setText("Masukkan jari-jari dan tinggi yang valid");
            return;
        }

        double jariJari = Double.parseDouble(jariJariStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double volume = (1.0/3.0) * Math.PI * jariJari * jariJari * tinggi;
        textViewHasil.setText("Volume kerucut dengan jari-jari " + jariJari +
                " dan tinggi " + tinggi + " adalah " + volume);
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
