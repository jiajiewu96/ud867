package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.text.TextUtils;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    private String resultJoke = null;
    Context context;

    @Test
    public void testVerifyJoke(){
        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        ApiResponseHandler apiResponseHandler = new ApiResponseHandler() {
            @Override
            public void onSuccess(String joke) {
                resultJoke = joke;
                latch.countDown();
                assertNotNull(resultJoke);
            }

            @Override
            public void onFailure(Exception e) {
                latch.countDown();
            }
        };
        asyncTask.setApiResponseHandler(apiResponseHandler);
        asyncTask.execute();
        try {
            latch.await();
            assertNotNull("Joke is null",resultJoke);
            assertFalse("String is empty", TextUtils.isEmpty(resultJoke));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}