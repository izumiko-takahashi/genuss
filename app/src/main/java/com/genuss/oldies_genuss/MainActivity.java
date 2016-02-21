package com.genuss.oldies_genuss;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;



public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_activity_layout);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(MainActivity.this, Categories.class);
                    startActivity(intent);
                }

            }
        };
        timerThread.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }


}