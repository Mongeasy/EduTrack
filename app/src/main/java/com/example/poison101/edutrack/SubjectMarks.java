package com.example.poison101.edutrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class SubjectMarks extends AppCompatActivity {


    BarChart barChart2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_marks);


        barChart2 = (BarChart) findViewById(R.id.bargraph2);


        //Term Marks
        ArrayList<BarEntry> barEntries = new ArrayList<>();


        barEntries.add(new BarEntry(19f, 0));
        barEntries.add(new BarEntry(89f, 1));
        barEntries.add(new BarEntry(86f, 2));
        barEntries.add(new BarEntry(52f, 3));
        barEntries.add(new BarEntry(44, 4));
        barEntries.add(new BarEntry(38, 5));
        barEntries.add(new BarEntry(46f, 6));


        //Term Avarage
        BarDataSet barChartSet = new BarDataSet(barEntries, "Subject Marks %");


        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("English");
        subjects.add("Mathematics");
        subjects.add("LO");
        subjects.add("Biology");
        subjects.add("Physical Science");
        subjects.add("Computer");
        subjects.add("IsiZulu");


        BarData theData = new BarData(subjects, barChartSet);
        barChart2.setData(theData);

        barChart2.setTouchEnabled(true);
        barChart2.setDragEnabled(true);
        barChart2.setScaleEnabled(true);


    }
}


