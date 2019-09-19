package com.udacity.gradle.builditbigger;

public interface ApiResponseHandler {
    void onSuccess(String joke);
    void onFailure(Exception e);
}
