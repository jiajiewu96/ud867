package com.udacity.gradle.builditbigger.displayjoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView setupTextView = findViewById(R.id.tv_setup);
        TextView punchLineTextView = findViewById(R.id.tv_punchline);
        Bundle intentExtras = getIntent().getExtras();
        if(intentExtras != null){
            String setup = intentExtras.getString(getResources().getString(R.string.SETUP_KEY));
            String punchLine = intentExtras.getString(getResources().getString(R.string.PUNCHLINE_KEY));
            setupTextView.setText(setup);
            punchLineTextView.setText(punchLine);

        }
    }
}
