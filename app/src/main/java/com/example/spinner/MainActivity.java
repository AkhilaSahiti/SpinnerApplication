package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private othercities others = new othercities();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickChooseCity(View view){
        TextView cities = (TextView) findViewById(R.id.cities);
        Spinner city = (Spinner) findViewById(R.id.city);
        String cityType = String.valueOf(city.getSelectedItem());

        List<String> otherList = others.getothers(cityType);
        StringBuilder cityFormatted = new StringBuilder();
        for (String places : otherList) {
            cityFormatted.append(places).append('\n');

        }
        //cities.setText(cityFormatted);
        cities.setText(cityType);

    }






    }

