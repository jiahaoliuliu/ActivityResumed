package com.jiahaoliuliu.activityresumed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private Button mStartSecondActivityButton;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("First Activity");
        mStartSecondActivityButton = (Button) findViewById(R.id.startSecondActivityButton);
        mStartSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startSecondActivityIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(startSecondActivityIntent);
            }
        });
        showToastAndLog("Activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToastAndLog("Activity started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToastAndLog("Activity restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToastAndLog("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToastAndLog("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToastAndLog("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToastAndLog("Activity destroyed");
    }

    private void showToastAndLog(String text) {
        if (TextUtils.isEmpty(text)) {
            throw new IllegalArgumentException("The text cannot be empty");
        }

        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
        Log.v(TAG, text);
    }
}
