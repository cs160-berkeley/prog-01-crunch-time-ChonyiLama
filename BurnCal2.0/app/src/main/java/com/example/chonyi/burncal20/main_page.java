package com.example.chonyi.burncal20;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class main_page extends AppCompatActivity implements AdapterView.OnItemClickListener {
   // public final static Double numOfCalories = "java/com"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.exerciseCategories,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        final EditText editAmount = (EditText) findViewById(R.id.editAmount);
        Button buttonConvert = (Button) findViewById(R.id.buttonConvert);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("BurnCal");
                Intent intent = new Intent(main_page.this, SecondActivity.class);
                double calories = 0.0;
                String numOfCalories = "hello";
                double exerciseAmount = Double.valueOf(editAmount.getText().toString());
                String selectedExercise = spinner.getSelectedItem().toString();
                if (selectedExercise.equals("Pushups")) {
                    calories = exerciseAmount * 100 / 350;
                } else if (selectedExercise.equals("Situps")) {
                    calories = exerciseAmount * 100 / 200;
                } else if (selectedExercise.equals("Squats")) {
                    calories = exerciseAmount * 100 / 225;
                } else if (selectedExercise.equals("Leg-lifts")) {
                    calories = exerciseAmount * 100 / 25;
                } else if (selectedExercise.equals("Planks")) {
                    calories = exerciseAmount * 100 / 25;
                } else if (selectedExercise.equals("Jumping Jacks")) {
                    calories = exerciseAmount * 100 / 10;
                } else if (selectedExercise.equals("Pullups")) {
                    calories = exerciseAmount * 100 / 100;
                } else if (selectedExercise.equals("Cycling")) {
                    calories = exerciseAmount * 100 / 12;
                } else if (selectedExercise.equals("Walking")) {
                    calories = exerciseAmount * 100 / 20;
                } else if (selectedExercise.equals("Jogging")) {
                    calories = exerciseAmount * 100 / 12;
                } else if (selectedExercise.equals("Swimming")) {
                    calories = exerciseAmount * 100 / 13;
                } else if (selectedExercise.equals("Stair-Climbing")) {
                    calories = exerciseAmount * 100 / 15;
                }

                intent.putExtra("numOfCalories", calories);
                intent.putExtra("exercise", selectedExercise);
                startActivity(intent);

            }
        });

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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        Toast.makeText(this, "You selected "+myText.getText(), Toast.LENGTH_SHORT).show();
    }

}
