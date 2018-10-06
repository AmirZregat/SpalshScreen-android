package com.amirzregat.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mySplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash_screen);

    Thread thread=new Thread(){
        @Override
        public void run() {
            try {
                sleep(3000);//how long do u want the splash screen to stay
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();//to close the splash screen
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
thread.start();
    }
}

//https://www.youtube.com/watch?v=7mZJtFFEvx8&index=48&list=PL7VN7OBi_bOO0I3nYn7VqrMws0wLrQtdx