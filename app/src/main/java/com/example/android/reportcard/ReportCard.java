package com.example.android.reportcard;



/**
 * Created by lokesh on 27/6/16.
 */
public class ReportCard  {

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


    public void  setSubjectGrade(String subjectGrade) {

        mSubjectGrade = subjectGrade;

    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mSubjectName='" + mSubjectName + '\'' +
                ", mSubjectGrade='" + mSubjectGrade + '\'' +
                '}';
    }
}
