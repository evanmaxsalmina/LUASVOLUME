package com.example.bottommenupakaji.bangundatar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class trapesium extends AppCompatActivity {

    EditText editTextSisiAtas, editTextSisiBawah, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trapesium);

        editTextSisiAtas = findViewById(R.id.editText);
        editTextSisiBawah = findViewById(R.id.editText2);
        editTextTinggi = findViewById(R.id.editText1);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasTrapesium();
            }
        });
    }

    private void hitungLuasTrapesium() {
        String sisiAtasStr = editTextSisiAtas.getText().toString();
        String sisiBawahStr = editTextSisiBawah.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();


        if (TextUtils.isEmpty(sisiAtasStr) || TextUtils.isEmpty(sisiBawahStr) ||
                TextUtils.isEmpty(tinggiStr) ||
                !isNumeric(sisiAtasStr) || !isNumeric(sisiBawahStr) || !isNumeric(tinggiStr)) {
            textViewHasil.setText("Masukkan panjang sisi yang valid");
            return;
        }

        double sisiAtas = Double.parseDouble(sisiAtasStr);
        double sisiBawah = Double.parseDouble(sisiBawahStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;
        textViewHasil.setText("Luas trapesium dengan sisi atas " + sisiAtas +
                ", sisi bawah " + sisiBawah + ", dan tinggi " + tinggi + " adalah " + luas);
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
