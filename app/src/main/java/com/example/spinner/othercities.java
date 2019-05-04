package com.example.spinner;
import java.util.ArrayList;
import java.util.List;
public class othercities {
    List<String> getothers(String cityType) {
        List<String> others = new ArrayList<>();
        if(cityType.equals("Delhi")) {
            others.add("India Gate");
            others.add("Jantar Mantar");


        }
        return others;


    }
}
