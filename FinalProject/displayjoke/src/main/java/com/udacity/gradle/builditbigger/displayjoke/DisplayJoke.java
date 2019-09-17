package com.udacity.gradle.builditbigger.displayjoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView jokeTextView = findViewById(R.id.tv_joke);
        Bundle intentExtras = getIntent().getExtras();
        if(intentExtras != null){
            String joke = intentExtras.getString(getResources().getString(R.string.joke_key));
            jokeTextView.setText(joke);
        }
    }
}
