package com.example.bottommenupakaji.bangundatar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottommenupakaji.R;

public class persegipanjang extends AppCompatActivity {

    EditText editTextPanjang, editTextLebar;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegipanjang);

        editTextPanjang = findViewById(R.id.editText);
        editTextLebar = findViewById(R.id.editText1);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegiPanjang();
            }
        });
    }

    private void hitungLuasPersegiPanjang() {
        String panjangStr = editTextPanjang.getText().toString();
        String lebarStr = editTextLebar.getText().toString();


        if (TextUtils.isEmpty(panjangStr) || TextUtils.isEmpty(lebarStr) ||
                !isNumeric(panjangStr) || !isNumeric(lebarStr)) {
            textViewHasil.setText("Masukkan panjang dan lebar yang valid");
            return;
        }

        double panjang = Double.parseDouble(panjangStr);
        double lebar = Double.parseDouble(lebarStr);
        double luas = panjang * lebar;
        textViewHasil.setText("Luas persegi panjang dengan panjang " + panjang +
                " dan lebar " + lebar + " adalah " + luas);
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
