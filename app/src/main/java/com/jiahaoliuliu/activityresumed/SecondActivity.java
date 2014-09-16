package com.jiahaoliuliu.activityresumed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    private static final String TAG = "SecondActivity";

    private Button mRestartMainActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mRestartMainActivityButton = (Button)findViewById(R.id.restartMainActivityButton);
        mRestartMainActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restartMainActivityIntent = new Intent(SecondActivity.this, MainActivity.class);
                restartMainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(restartMainActivityIntent);
            }
        });
    }
}
