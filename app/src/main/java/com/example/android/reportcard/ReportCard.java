package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by lokesh on 27/6/16.
 */
public class ReportCard extends AppCompatActivity {

    private String mSubjectName;
    private  String mSubjectGrade;

  public ReportCard(String sName, String sGrade){
      mSubjectGrade = sGrade;
      mSubjectName  = sName;

  }

    public String getSubjectName(){
        return mSubjectName;
    }

    public String getSubjectGrade(){
        return mSubjectGrade;
    }



}
