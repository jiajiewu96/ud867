package com.udacity.gradle.builditbigger.jokeProvider;

import java.util.ArrayList;
import java.util.Random;

public class JokeProvider {

    public String getJoke(){
        Jokes jokes = new Jokes();
        int min = 0;
        int max = jokes.getSize() -1;
        int randIndex = getRandomNumberInRange(min, max);

        return jokes.getJoke(randIndex);

    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
