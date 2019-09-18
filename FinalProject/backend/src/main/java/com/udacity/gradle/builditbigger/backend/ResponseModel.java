package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.builditbigger.jokeProvider.Joke;

public class ResponseModel {
    private Joke myData;

    public Joke getData() {
        return myData;
    }

    public void setData(Joke data) {
        myData = data;
    }
}
