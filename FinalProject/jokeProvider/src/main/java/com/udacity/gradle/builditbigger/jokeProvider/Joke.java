package com.udacity.gradle.builditbigger.jokeProvider;

import java.io.Serializable;

public class Joke implements Serializable {
    private String setUp;
    private String punchLine;
    public Joke(String setUp, String punchLine){
        this.setUp = setUp;
        this.punchLine = punchLine;
    }

    public String getPunchLine() {
        return punchLine;
    }

    public String getSetUp() {
        return setUp;
    }
}
