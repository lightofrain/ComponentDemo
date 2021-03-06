package com.netease.componentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.netease.liveroomsdk.TestLiveRoomActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mTvGoLiveroom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvGoLiveroom = findViewById(R.id.tv_go_liveroom);
        mTvGoLiveroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestLiveRoomActivity.class));
            }
        });
    }
}
