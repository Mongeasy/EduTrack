package com.example.poison101.edutrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class Graph extends AppCompatActivity {

    BarChart barChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);


        barChart = (BarChart) findViewById(R.id.bargraph);


        //Term Marks
        ArrayList<BarEntry> barEntries = new ArrayList<>();


        barEntries.add(new BarEntry(44, 0));
        barEntries.add(new BarEntry(88, 1));
        barEntries.add(new BarEntry(66f, 2));
        barEntries.add(new BarEntry(12f, 3));


        //Term Avarage
        BarDataSet barChartSet = new BarDataSet(barEntries, "Average %");


        ArrayList<String> theDates = new ArrayList<>();

        theDates.add("Term 1");
        theDates.add("Term 2");
        theDates.add("Term 3");
        theDates.add("Term 4");


        BarData theData = new BarData(theDates, barChartSet);
        barChart.setData(theData);

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);


    }
}


