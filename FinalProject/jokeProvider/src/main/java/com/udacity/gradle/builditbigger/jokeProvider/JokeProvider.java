package com.udacity.gradle.builditbigger.jokeProvider;

import java.util.ArrayList;
import java.util.Random;

public class JokeProvider {

    private ArrayList<Joke> mJokes;

    public JokeProvider(){
        constructJokes();
    }

    public Joke getJoke(){
        int min = 0;
        int max = mJokes.size() -1;
        int randIndex = getRandomNumberInRange(min, max);
        return mJokes.get(randIndex);

    }

    private void constructJokes() {
        mJokes = new ArrayList<>();
        String[] setUp = {
                "What's the best thing about Switzerland?\n" ,
                "Why don't scientists trust atom?\n",
                "Why did the chicken go the the seance?\n",
                "Where are average things manufactured?\n",
                "How do you drown a hipster?\n",
                "What sits at the bottom of the sea and twitches?\n",
                "What does the nosy pepper do?\n",
                "How does Moses make tea?\n",
                "How do you keep a bagel from getting away?\n"
        };
        String[] punchLine = {
                "I don't know, but he flag is a big plus.",
                "Because they make up everything.",
                "To get to the other side.",
                "The satisfactory.",
                "Throw him in the mainstream.",
                "A nervous wreck.",
                "Gets jalapeno business.",
                "He brews.",
                "Put lox on it."
        };
        for(int i = 0; i<setUp.length; i++){
            mJokes.add(new Joke(setUp[i], punchLine[i]));
        }
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
