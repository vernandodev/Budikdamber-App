package com.example.budikdamberapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class HandlerPanduan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handlerpanduan);

        ImageSlider imageSlider = findViewById(R.id.panduan1);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.panduan1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.panduan2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.panduan3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.panduan4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.panduan5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.panduan6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.panduan7, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.panduan8, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}
