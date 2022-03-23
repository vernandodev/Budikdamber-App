package com.example.budikdamberapp.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.budikdamberapp.HandlerPanduan;
import com.example.budikdamberapp.HandlerScan;
import com.example.budikdamberapp.R;

public class ScanFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_scan, container, false);

        ImageButton btn_panduan = (ImageButton) view.findViewById(R.id.btn_panduan);
        ImageButton btn_scan = (ImageButton) view.findViewById(R.id.btn_scan);

        btn_panduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent panduan = new Intent(getActivity(), HandlerPanduan.class );
                startActivity(panduan);
            }
        });

        btn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scan = new Intent(getActivity(), HandlerScan.class );
                startActivity(scan);
            }
        });


        return view;
    }
}