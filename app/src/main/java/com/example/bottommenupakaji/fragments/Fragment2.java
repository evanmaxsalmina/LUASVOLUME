package com.example.bottommenupakaji.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.bottommenupakaji.R;
import com.example.bottommenupakaji.bangundatar.jajargenjang;
import com.example.bottommenupakaji.bangundatar.lingkaran;
import com.example.bottommenupakaji.bangundatar.persegi;
import com.example.bottommenupakaji.bangundatar.persegipanjang;
import com.example.bottommenupakaji.bangundatar.segitiga;
import com.example.bottommenupakaji.bangundatar.trapesium;
import com.example.bottommenupakaji.bangunruang.balok;
import com.example.bottommenupakaji.bangunruang.bola;
import com.example.bottommenupakaji.bangunruang.kerucut;
import com.example.bottommenupakaji.bangunruang.kubus;
import com.example.bottommenupakaji.bangunruang.limas;
import com.example.bottommenupakaji.bangunruang.tabung;


public class Fragment2 extends Fragment {

    ImageView kubus, balok, tabung, kerucut, bola, limas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container,false);

        kubus = view.findViewById(R.id.kubus);
        balok = view.findViewById(R.id.balok);
        tabung = view.findViewById(R.id.tabung);
        kerucut = view.findViewById(R.id.kerucut);
        bola = view.findViewById(R.id.bola);
        limas = view.findViewById(R.id.limas);


        kubus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent = new Intent(getActivity(),kubus.class);
                startActivity(intent);
            }
        });

        balok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent = new Intent(getActivity(),balok.class);
                startActivity(intent);
            }
        });

        tabung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent = new Intent(getActivity(),tabung.class);
                startActivity(intent);
            }
        });

        kerucut.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent = new Intent(getActivity(),kerucut.class);
                startActivity(intent);
            }
        });

        bola.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                Intent intent = new Intent(getActivity(),bola.class);
                startActivity(intent);
            }
        });

        limas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), limas.class);
                startActivity(intent);
            }
        });

        return view;
    }
}