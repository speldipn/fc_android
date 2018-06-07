package com.speldipn.example.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentActivity extends AppCompatActivity {

  Button btnSms;
  Button btnCall;
  Button btnUrl;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_intent);

    btnCall = findViewById(R.id.btnCall);
    btnSms = findViewById(R.id.btnSms);
    btnUrl = findViewById(R.id.btnUrl);

    btnCall.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-5025-4321"));
        startActivity(intent);
      }
    });

    btnSms.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:010-5025-4321"));
        startActivity(intent);
      }
    });

    btnUrl.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
      }
    });
  }
}
