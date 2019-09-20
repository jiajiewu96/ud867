package com.udacity.gradle.builditbigger.paid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.udacity.gradle.builditbigger.ApiResponseHandler;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.displayjoke.DisplayJoke;


public class MainActivity extends AppCompatActivity implements ApiResponseHandler{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.setApiResponseHandler(this);
        endpointsAsyncTask.execute();
    }

    void launchDisplayActivity(String joke){
        Intent intent = new Intent(this, DisplayJoke.class);
        intent.putExtra(getResources().getString(R.string.JOKE_KEY), joke);
        startActivity(intent);
    }


    @Override
    public void onSuccess(String joke) {
       launchDisplayActivity(joke);
    }

    @Override
    public void onFailure(Exception e) {
        Toast.makeText(this, "There was an error " + e.toString(), Toast.LENGTH_SHORT).show();
    }
}
