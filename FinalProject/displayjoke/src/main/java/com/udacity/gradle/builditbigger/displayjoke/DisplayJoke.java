package com.udacity.gradle.builditbigger.displayjoke;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    private String mJoke = "There's no joke available";
    private String mKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView jokeLineTextView = findViewById(R.id.tv_joke);
        Bundle intentExtras = getIntent().getExtras();
        mKey = getResources().getString(R.string.JOKE_KEY);
        if(intentExtras != null){
            mJoke = intentExtras.getString(mKey);
        } else if(savedInstanceState != null){
            mJoke = savedInstanceState.getString(mKey);
        } else{
            jokeLineTextView.setText(mJoke);
        }

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        outState.putString(mKey, mJoke);
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
