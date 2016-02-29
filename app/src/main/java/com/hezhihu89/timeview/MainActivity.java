package com.hezhihu89.timeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hezhihu89.timeview.view.TimeView;

public class MainActivity extends AppCompatActivity {
    private TimeView timeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeView = (TimeView) findViewById(R.id.time_demo);
        timeView.setTime(60);
    }

    public void update(View view) {
        timeView.reStart(100);
    }


    public void update1(View view) {
        //回到设置的事件
        timeView.reStart();
    }
}
