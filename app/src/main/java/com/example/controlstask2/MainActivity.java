package com.example.controlstask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a vertical LinearLayout
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(mainLayout);

        // Create first half
        LinearLayout firstHalf = new LinearLayout(this);
        firstHalf.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 0, 1));
        firstHalf.setGravity(Gravity.CENTER);
        firstHalf.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));

        // Create first greed
        GridLayout gridLayout1 = new GridLayout(this);
        gridLayout1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        gridLayout1.setRowCount(2);
        gridLayout1.setColumnCount(2);

        for (int i = 1; i <= 4; i++) {
            Button button = new Button(this);
            button.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            button.setText("Button " + i);
            gridLayout1.addView(button);
        }

        // Add grid to the first half
        firstHalf.addView(gridLayout1);

        // Create second half
        LinearLayout secondHalf = new LinearLayout(this);
        secondHalf.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 0, 1));
        secondHalf.setGravity(Gravity.CENTER);
        secondHalf.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));

        // Create second grid
        GridLayout gridLayout2 = new GridLayout(this);
        gridLayout2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        gridLayout2.setRowCount(2);
        gridLayout2.setColumnCount(2);

        for (int i = 5; i <= 8; i++) {
            Button button = new Button(this);
            button.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            button.setText("Button " + i);
            gridLayout2.addView(button);
        }

        // Add grid to the second half
        secondHalf.addView(gridLayout2);

        // Add halfs to LinearLayout
        mainLayout.addView(firstHalf);
        mainLayout.addView(secondHalf);
    }
}