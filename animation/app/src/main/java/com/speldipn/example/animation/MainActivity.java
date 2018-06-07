package com.speldipn.example.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Animation animation;
  Animation animTrans;
  Animation animRotate;
  Button button;
  Button btnTrans;
  Button btnRotate;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    button = findViewById(R.id.button);
    btnTrans = findViewById(R.id.btnTrans);
    btnRotate = findViewById(R.id.btnRotate);
    animation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.scale);
    animTrans = AnimationUtils.loadAnimation(getBaseContext(), R.anim.translate);
    animRotate = AnimationUtils.loadAnimation(getBaseContext(), R.anim.complex);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        button.startAnimation(animation);
      }
    });

    btnTrans.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        btnTrans.startAnimation(animTrans);
      }
    });

    btnRotate.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        btnRotate.startAnimation(animRotate);
      }
    });
  }
}
