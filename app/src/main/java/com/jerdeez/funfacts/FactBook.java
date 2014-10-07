package com.jerdeez.funfacts;

import java.util.Random;

/**
 * Created by Owner-1 on 10/3/2014.
 */
public class FactBook {

    //Member variables properties about the project
    //This is a String array to create the facts in our app.
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            //"",
            //"aiyana is awesome",
            //"",
            "In total there is said to be around 400 million dogs in the world.",
            "It is impossible for most people to lick their own elbow. (try it!)",
            "A crocodile cannot stick its tongue out.",
            "A shrimp's heart is in its head.",
            "It is physically impossible for pigs to look up into the sky.",
            "If you sneeze too hard, you could fracture a rib.",
            "Rats multiply so quickly that in 18 months, two rats could have over a million descendants",
            "Wearing headphones for just an hour could increase the bacteria in your ear by 700 times.",
            "In every episode of Seinfeld there was a Superman somewhere in the picture.",
            "Some lipsticks contain fish scales",
            "Cat urine glows under a black-light.",
            "Like fingerprints, everyone's tongue print is different.",
            "There are 293 ways to make change for a dollar.",
            "Tigers have striped skin, not just striped fur.",
            "The giant squid has the largest eyes in the world.",
            "Most people fall asleep in seven minutes.",
            "An ostrich's eye is bigger than its brain.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };

    //Methods abilities things the object can do.
    //This method is called to get a fact
    public String getFact(){


        //This is to tell our string of facts that we want it to be blank without certain fact.
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();//Construct a new Random generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        //this is making our facts to be randomly selected.
        fact = mFacts[randomNumber];
        //This returns our code to run again
        return fact;
    }
}
