package com.dominicmortel.myapplication;

import android.content.Intent;
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

    //Declare a global TextView that can be accessed by all local functions
    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_screen);

        TextView pointsCounterView = new TextView(this);

        //hardcode these until we can make a rand()
        points00 = 1;
        points01 = 0;
        points10 = 0;
        points11 = 0;

        //this is the points counter text view
        pointsCounterView.setId(R.id.pointsCounterView);
        pointsCounterView.setText(Integer.toString(pointsCounter));
    }
    //there might be a better way to do this using onClick ids
   public void pic00click(View view) {
        test = (TextView)findViewById(R.id.pointsCounterView);
        pointsCounter += (points00*2);
        test.setText(Integer.toString(pointsCounter));
    }
    public void pic01click(View view) {
        test = (TextView)findViewById(R.id.pointsCounterView);
        pointsCounter += points01;
        test.setText(Integer.toString(pointsCounter));
    }
    public void pic10click(View view) {
        test = (TextView)findViewById(R.id.pointsCounterView);
        pointsCounter += points10;
        test.setText(Integer.toString(pointsCounter));
    }
    public void pic11click(View view) {
        test = (TextView)findViewById(R.id.pointsCounterView);
        pointsCounter += points11;
        test.setText(Integer.toString(pointsCounter));
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
