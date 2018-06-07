package com.speldipn.example.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PropAniActivity extends AppCompatActivity {

  AnimatorSet aniSet;
  ObjectAnimator moveX;
  ObjectAnimator moveY;
  Button btnMove;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_prop_ani);

    btnMove = findViewById(R.id.btnMove);

    moveX = ObjectAnimator.ofFloat(
      btnMove,
      "translationX",
      100
    );

    moveY = ObjectAnimator.ofFloat(
      btnMove,
      "translationY",
      100
    );

    aniSet = new AnimatorSet();
    aniSet.playTogether(moveX, moveY);
    aniSet.setDuration(5000);

    btnMove.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        aniSet.start();
      }
    });
  }
}
