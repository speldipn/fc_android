package com.speldipn.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  public static final String TAG = "OneActivity";
  Button btnTwo, btnThree;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d(TAG, "======== onCreate()");

    btnTwo = findViewById(R.id.btnTwo);
    btnThree = findViewById(R.id.btnThree);

    btnTwo.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getBaseContext(), TwoActivity.class);
        startActivity(intent);
      }
    });

    btnThree.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getBaseContext(), ThreeActivity.class);
        startActivity(intent);
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
