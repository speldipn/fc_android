package com.speldipn.example.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  Button btnOpenAcitivy;
  EditText toSecond;
  EditText fromSecond;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    toSecond = findViewById(R.id.textToSecond);
    fromSecond = findViewById(R.id.textFromSecond);

    btnOpenAcitivy = findViewById(R.id.btnOpenActivity);
    btnOpenAcitivy.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // 다른 액티비티 호출.

        // 시스템에 던져줄 다른 액티비티를 호출하라고 메세지를 전달
        // 1. Intent 생성
        Intent intent = new Intent(getBaseContext(), SecondActivity.class);

        // 1.1 Intent에 값을 담아서 전달하기.
        String value = toSecond.getText().toString();
        intent.putExtra("key01", value);

        // 2. 안드로이드에 액티비티를 실행해달라고 Intent를 전달
        startActivityForResult(intent, 999);
      }
    });
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//    super.onActivityResult(requestCode, resultCode, data);
    if(requestCode == 999) {
      if(resultCode == RESULT_OK) {
        Intent intent = data;
        String value = intent.getStringExtra("key02");
        fromSecond.setText(value);
      }
    }
  }
}
