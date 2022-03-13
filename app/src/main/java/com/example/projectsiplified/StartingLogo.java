package com.example.projectsiplified;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StartingLogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_logo  );

        Thread thread = new Thread(){

            public void run(){
                try {

                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent newIntent = new Intent(StartingLogo.this, LoginRegisterSelect.class);
                    startActivity(newIntent);
                    finish();
                }
            }

        };

        thread.start();
    }
}