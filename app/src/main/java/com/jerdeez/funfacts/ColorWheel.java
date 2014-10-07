package com.jerdeez.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Owner-1 on 10/3/2014.
 */
public class ColorWheel {

//Member variables properties about the project
//This is an String array of colors for our color wheel function.
public String[] mColors = {
        "#39add1", // light blue
        "#3079ab", // dark blue
        "#c25975", // mauve
        "#e15258", // red
        "#f9845b", // orange
        "#838cc7", // lavender
        "#7d669e", // purple
        "#53bbb4", // aqua
        "#51b46d", // green
        "#e0ab18", // mustard
        "#637a91", // dark gray
        "#f092b0", // pink
        "#b7c0c7"  // light gray
};

    //Methods abilities things the object can do.
    public int getColor(){


       //This is to tell our string of colors that we want it to be blank without certain color.
        String color = "";
        //Randomly select a color
        Random randomGenerator = new Random();//Construct a new Random generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

       //this is making our colors to be randomly selected.
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        //This returns our code to run again
        return colorAsInt;
    }
}
