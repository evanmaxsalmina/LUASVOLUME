package com.example.bottommenupakaji.bangundatar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class jajargenjang extends AppCompatActivity {

    EditText editTextAlas, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jajargenjang);

        editTextAlas = findViewById(R.id.editText);
        editTextTinggi = findViewById(R.id.editText1);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasJajarGenjang();
            }
        });
    }

    private void hitungLuasJajarGenjang() {
        String alasStr = editTextAlas.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        if (TextUtils.isEmpty(alasStr) || TextUtils.isEmpty(tinggiStr) ||
                !isNumeric(alasStr) || !isNumeric(tinggiStr)) {
            textViewHasil.setText("Masukkan alas dan tinggi yang valid");
            return;
        }

        double alas = Double.parseDouble(alasStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double luas = alas * tinggi;
        textViewHasil.setText("Luas jajar genjang dengan alas " + alas +
                " dan tinggi " + tinggi + " adalah " + luas);
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
