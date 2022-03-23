package com.example.budikdamberapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.budikdamberapp.PerkembanganActivity;
import com.example.budikdamberapp.InstalasiActivity;
import com.example.budikdamberapp.PengertianActivity;
import com.example.budikdamberapp.PerawatanActivity;
import com.example.budikdamberapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton btn_1 = (ImageButton) view.findViewById(R.id.btn_pengertian);
        ImageButton btn_2 = (ImageButton) view.findViewById(R.id.btn_instalasi);
        ImageButton btn_3 = (ImageButton) view.findViewById(R.id.btn_perawatan);
        ImageButton btn_4 = (ImageButton) view.findViewById(R.id.btn_perkembangan);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pengertian = new Intent(getActivity(), PengertianActivity.class );
                startActivity(pengertian);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instalasi = new Intent(getActivity(), InstalasiActivity.class );
                startActivity(instalasi);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent perawatan = new Intent(getActivity(), PerawatanActivity.class );
                startActivity(perawatan);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent perkembangan = new Intent(getActivity(), PerkembanganActivity.class );
                startActivity(perkembangan);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.banner3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.banner2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.banner1, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}