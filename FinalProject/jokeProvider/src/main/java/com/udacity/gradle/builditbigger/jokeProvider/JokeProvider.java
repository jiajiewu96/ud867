package com.udacity.gradle.builditbigger.jokeProvider;

import java.util.Random;

public class JokeProvider {

    Jokes mJokes;

    public String getJoke(){
        mJokes = new Jokes();
        int min = 0;
        int max = mJokes.getSize() -1;
        int jokeIndex = getRandomNumberInRange(min, max);

        return mJokes.getJoke(jokeIndex);

    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
