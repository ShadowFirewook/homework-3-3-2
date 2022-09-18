package com.example.homework_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

private ArrayList <String> cityList = new ArrayList<>();
private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.resycler_view);
        Collections.addAll(cityList,"Бишкек","Москва","Токио","Сеул","Вашингтон","Лондон","Париж","Пекин","Вена","Мадрид","Канберра","Мехико","Оттава","Осло","Киев","Дели","Каир","Бразилиа");
CityAdapter adapter = new CityAdapter(cityList);
recyclerView.setAdapter(adapter);
    }
}