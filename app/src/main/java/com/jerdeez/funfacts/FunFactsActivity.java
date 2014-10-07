package com.jerdeez.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

import static android.view.View.OnClickListener;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);



        //Declare our view variables and assign the views from the layout file.
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout =(RelativeLayout)findViewById(R.id.relativeLayout);


        //This is for when someone clicks the button or other
        OnClickListener listener = new OnClickListener() {

            @Override
            public void onClick(View view) {
          String fact = mFactBook.getFact();


          //Update the label with our dynamic fact
         factLabel.setText(fact);
           //this is to change the colors of our ColorWheel class
           int color = mColorWheel.getColor();
           //we have to set the color for our page
           relativeLayout.setBackgroundColor(color);
           showFactButton.setTextColor(color);




            }
        };
        showFactButton.setOnClickListener(listener);





    }







}
