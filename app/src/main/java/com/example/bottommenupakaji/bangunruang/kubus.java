package com.example.bottommenupakaji.bangunruang;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class kubus extends AppCompatActivity {

    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        editTextSisi = findViewById(R.id.editText);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeKubus();
            }
        });
    }

    private void hitungVolumeKubus() {
        String sisiStr = editTextSisi.getText().toString();

        if (TextUtils.isEmpty(sisiStr) || !isNumeric(sisiStr)) {
            textViewHasil.setText("Masukkan panjang sisi yang valid");
            return;
        }

        double sisi = Double.parseDouble(sisiStr);
        double volume = sisi * sisi * sisi;
        textViewHasil.setText("Volume kubus dengan sisi " + sisi + " adalah " + volume);
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
