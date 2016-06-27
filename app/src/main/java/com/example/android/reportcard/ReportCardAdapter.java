package com.example.android.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lokesh on 27/6/16.
 */
public class ReportCardAdapter extends ArrayAdapter<ReportCard> {

    public ReportCardAdapter(Context context, ArrayList<ReportCard> grades) {
        super(context, 0, grades);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_grades, parent, false);

        ReportCard currentGrade = getItem(position);


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.subject_name);
        nameTextView.setText(currentGrade.getSubjectName());


        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.subject_grade);
        gradeTextView.setText(currentGrade.getSubjectGrade());


        return listItemView;
    }
}
