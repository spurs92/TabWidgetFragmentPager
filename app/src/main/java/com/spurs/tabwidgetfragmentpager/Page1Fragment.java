package com.spurs.tabwidgetfragmentpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

/**
 * Created by alfo06-11 on 2017-06-07.
 */

public class Page1Fragment extends Fragment {

    DatePicker datePicker;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_page1,container,false);

        datePicker=(DatePicker)view.findViewById(R.id.datepicker);



        return view;
    }
}
