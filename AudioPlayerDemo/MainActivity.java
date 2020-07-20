package com.example.audiodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
//    MediaPlayer mp;
    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv = findViewById(R.id.vv);
        vv.setVideoPath("android.resource://com.example.audiodemo/"+R.raw.video);
        //vv.requestFocus();
        vv.start();
//        mp = MediaPlayer.create(MainActivity.this, R.raw.audio);
//        mp.start();
//        //mp.pause();
//        //mp.stop();

    }
}

//create three buttons
//res - > New resource directory - > raw
