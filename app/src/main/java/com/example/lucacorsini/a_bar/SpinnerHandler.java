package com.example.lucacorsini.a_bar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class SpinnerHandler implements OnItemSelectedListener {
    private boolean isFirst = true;
    private ScontrinoActivity se2a;
    private CassaActivity cassact;
    public SpinnerHandler(ScontrinoActivity activity){

        this.se2a = activity;
    }
    public SpinnerHandler(CassaActivity activity){

        this.cassact = activity;
    }
    /** This method will invoke when an entry is selected. Invoked once
     when Spinner is first displayed, then again for each time the user selects something
     */
    @Override
    public void onItemSelected(AdapterView<?> spinner, View selectedView,
                               int selectedIndex, long id) {
        // Do not want to display the toast while the activity first loaded.
        if (isFirst) {
            isFirst = false;
        } else {
            String selection =
                    spinner.getItemAtPosition(selectedIndex).toString();

        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}

