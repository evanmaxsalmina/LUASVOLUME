package com.example.bottommenupakaji.bangunruang;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class balok extends AppCompatActivity {

    EditText editTextPanjang, editTextLebar, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        editTextPanjang = findViewById(R.id.editText);
        editTextLebar = findViewById(R.id.editText2);
        editTextTinggi = findViewById(R.id.editText1);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBalok();
            }
        });
    }

    private void hitungVolumeBalok() {
        String panjangStr = editTextPanjang.getText().toString();
        String lebarStr = editTextLebar.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        if (TextUtils.isEmpty(panjangStr) || TextUtils.isEmpty(lebarStr) ||
                TextUtils.isEmpty(tinggiStr) ||
                !isNumeric(panjangStr) || !isNumeric(lebarStr) || !isNumeric(tinggiStr)) {
            textViewHasil.setText("Masukkan panjang, lebar, dan tinggi yang valid");
            return;
        }

        double panjang = Double.parseDouble(panjangStr);
        double lebar = Double.parseDouble(lebarStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double volume = panjang * lebar * tinggi;
        textViewHasil.setText("Volume balok dengan panjang " + panjang +
                ", lebar " + lebar + ", dan tinggi " + tinggi + " adalah " + volume);
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
