package com.speldipn.example.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

  TextView valueText;
  EditText toFirst;
  Button btnFinish;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    toFirst = findViewById(R.id.textToFirst);
    btnFinish = findViewById(R.id.btnFinish);

    Intent intent = getIntent();
    String value = intent.getStringExtra("key01");

    valueText = findViewById(R.id.valueText);
    valueText.setText(value);

    btnFinish.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String value   = toFirst.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("key02", value);

        // 생성한 인스턴스를 그대로 사용하므로 함수 호출시 context를 필요로 하지 않음.
        setResult(RESULT_OK, intent);

        finish();
      }
    });


  }
}
