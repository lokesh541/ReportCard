package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList <ReportCard> grades = new ArrayList<ReportCard>();

        grades.add(new ReportCard("English","B"));
        grades.add(new ReportCard("Maths","A"));
        grades.add(new ReportCard("Physics","A"));
        grades.add(new ReportCard("Chemistry","B"));
        grades.add(new ReportCard("programming","A"));



    ReportCardAdapter gradesAdapter = new ReportCardAdapter(this,grades);

    ListView listView = (ListView) findViewById(R.id.listview_grades);
    listView.setAdapter(gradesAdapter);
    }

}
