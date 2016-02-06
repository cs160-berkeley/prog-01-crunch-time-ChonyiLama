package com.example.chonyi.burncal20;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("BurnCal");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent = getIntent();
        double calories = Math.ceil(intent.getDoubleExtra("numOfCalories", 421));
        String exercise = intent.getStringExtra("exercise");
        TextView textCalories = new TextView(this);
        textCalories.setTextSize(20);
        textCalories.setText("You burned " + String.valueOf(calories) + " calories!");
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textCalories);

        double numPushups = Math.ceil(calories * 350/100);
        double numSitups = Math.ceil(calories * 200/100);
        double numSquats = Math.ceil(calories * 225/100);
        double numLeglifts = Math.ceil(calories * 25/100);
        double numPlank = Math.ceil(calories * 25/100);
        double numJumpingjacks = Math.ceil(calories * 10/100);
        double numPullup = Math.ceil(calories * 100/100);
        double numCycling = Math.ceil(calories * 12/100);
        double numWalking = Math.ceil(calories * 20/100);
        double numJogging = Math.ceil(calories * 12/100);
        double numSwimming = Math.ceil(calories * 13/100);
        double numStairclimbing = Math.ceil(calories * 15/100);
/**
        TextView dynamicTextView = new TextView(this);
        dynamicTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        dynamicTextView.setText(" Hello World ");
        layout.addView(dynamicTextView);
**/
        TextView textView4 = (TextView) findViewById(R.id.ex3);
        TextView textView5 = (TextView) findViewById(R.id.ex5);
        TextView textView6 = (TextView) findViewById(R.id.ex2);
     //   TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.ex6);
        TextView textView9 = (TextView) findViewById(R.id.ex7);
        TextView textView10 = (TextView) findViewById(R.id.ex8);
        TextView textView11 = (TextView) findViewById(R.id.ex9);
        TextView textView12 = (TextView) findViewById(R.id.ex1);
        TextView textView13 = (TextView) findViewById(R.id.ex11);
        TextView textView14 = (TextView) findViewById(R.id.ex10);

        textView4.setText(numSitups + " sit ups");
        textView5.setText(numSquats + " squats");
        textView6.setText(numLeglifts + " leg lifts");
       // textView7.setText(numPlank + " minutes of planks");
        textView8.setText(numJumpingjacks + " jumping jacks");
        textView9.setText(numPullup + " pull ups");
        textView10.setText(numCycling + " minutes of cycling");
        textView11.setText(numWalking + " minutes of walking");
        textView12.setText(numJogging + " minutes of jogging");
        textView13.setText(numSwimming + " minutes of swimming");
        textView14.setText(numStairclimbing + " minutes of stair climbing");




    }
    private final String htmlText = "<body><h1>Heading Text</h1><p>This tutorial " +
            "explains how to display " +
            "<strong>HTML </strong>text in android text view.&nbsp;</p>" +
            "<blockquote>Example from <a href=\"www.javatechig.com\">" +
            "Javatechig.com<a></blockquote></body>";



}
