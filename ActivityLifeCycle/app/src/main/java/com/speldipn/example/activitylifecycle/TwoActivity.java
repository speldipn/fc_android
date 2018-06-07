package com.speldipn.example.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity {

  public static final String TAG = "TwoActivity";
  Button btnFinish;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_two);

    Log.d(TAG, "======== onCreate()");

    btnFinish = findViewById(R.id.btnFinish);
    btnFinish.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        finish();
      }
    });
  }

  @Override
  protected void onStart() {
    Log.d(TAG, "======== onStart");
    super.onStart();
  }

  @Override
  protected void onResume() {
    Log.d(TAG, "======== onResume");
    super.onResume();
  }

  @Override
  protected void onPause() {
    Log.d(TAG, "======== onPause");
    super.onPause();
  }

  @Override
  protected void onStop() {
    Log.d(TAG, "======== onStop");
    super.onStop();
  }

  @Override
  protected void onDestroy() {
    Log.d(TAG, "======== onDestroy");
    super.onDestroy();
  }

}
