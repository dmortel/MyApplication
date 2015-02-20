package com.dominicmortel.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class gameScreen extends ActionBarActivity {

    //instantiate to 999 so we can detect if an error has occured but it does not raise a
    //error if something has gone wrong in the life cycle
    int points00 = 999;
    int points01 = 999;
    int points10 = 999;
    int points11 = 999;
    int pointsCounter = 0;
    //declare it up here so it is global (to this class)
    TextView pointsCounterView = new TextView(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        //hardcode these until we can make a rand()
        points00 = 1;
        points01 = 0;
        points10 = 0;
        points11 = 0;
        //this is the points counter text view
        pointsCounterView.setId(R.id.pointsCounterView);
        pointsCounterView.setText(pointsCounter);
    }
    //there might be a better way to do this using onClick ids
    public void pic00click(View view) {
        pointsCounter += points00;
        pointsCounterView.setText(pointsCounter);
    }
    public void pic01click(View view) {
        pointsCounter += points01;
        pointsCounterView.setText(pointsCounter);
    }
    public void pic10click(View view) {
        pointsCounter += points10;
        pointsCounterView.setText(pointsCounter);
    }
    public void pic11click(View view) {
        pointsCounter += points11;
        pointsCounterView.setText(pointsCounter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_screen, menu);
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
}
