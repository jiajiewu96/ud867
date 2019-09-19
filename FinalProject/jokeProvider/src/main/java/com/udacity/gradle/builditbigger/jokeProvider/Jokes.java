package com.udacity.gradle.builditbigger.jokeProvider;

public class Jokes {

    private String[] jokes = {
            "What's the best thing about Switzerland?\n I don't know, but he flag is a big plus." ,
            "Why don't scientists trust atom?\n Because they make up everything.",
            "Why did the chicken go the the seance?\n To get to the other side.",
            "Where are average things manufactured?\n The satisfactory.",
            "How do you drown a hipster?\n Throw him in the mainstream.",
            "What sits at the bottom of the sea and twitches?\n A nervous wreck.",
            "What does the nosy pepper do?\n Gets jalapeno business.",
            "How does Moses make tea?\n He brews.",
            "How do you keep a bagel from getting away?\n Put lox on it."
    };
    private int jokeArraySize = jokes.length;

    public String getJoke(int i){
        return jokes[i];
    }
    public int getSize(){
        return jokeArraySize;
    }
}
