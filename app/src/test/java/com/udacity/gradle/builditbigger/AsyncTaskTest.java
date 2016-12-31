package com.udacity.gradle.builditbigger;

/**
 * Created by The Crab on 6/03/2016.
 */

import android.content.Context;
import android.test.AndroidTestCase;
import org.mockito.Mock;
import java.util.concurrent.TimeUnit;



public class AsyncTaskTest extends  AndroidTestCase{

    EndpointsAsyncTask task;
    String result;
    @Mock Context mockContext;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        result = null;
//        task = new EndpointsAsyncTask(mockContext){
        task = new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String joke){
                //No need to launch intent, so override this method
            }
        };
    }

    public void testAsyncReturnType() {

        try{
           // task.execute(mockContext);
            task.execute();
            result = task.get(10, TimeUnit.SECONDS);
            assertNotNull(result);

        }catch (Exception e){
            fail("Timed out");
        }
    }
}