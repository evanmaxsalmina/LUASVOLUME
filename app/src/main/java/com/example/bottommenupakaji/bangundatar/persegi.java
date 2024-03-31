package com.example.bottommenupakaji.bangundatar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class persegi extends AppCompatActivity {

    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);

        editTextSisi = findViewById(R.id.editText);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });
    }

    private void hitungLuasPersegi() {
        String sisiStr = editTextSisi.getText().toString();

        if (TextUtils.isEmpty(sisiStr)) {
            Toast.makeText(this, "Masukkan panjang sisi", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!isNumeric(sisiStr)) {
            Toast.makeText(this, "Masukkan harus berupa angka", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi = Double.parseDouble(sisiStr);
        double luas = sisi * sisi;
        textViewHasil.setText("Luas persegi dengan sisi " + sisi + " adalah " + luas);
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
