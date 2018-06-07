package com.speldipn.example.samplelinearlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

public class LayoutCodeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    LinearLayout mainLayout = new LinearLayout(this);
    mainLayout.setOrientation(LinearLayout.VERTICAL);

    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
      LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

    Button button0 = new Button(this);
    button0.setText("Button 01");
    button0.setLayoutParams(params);
    mainLayout.addView(button0);

    setContentView(mainLayout);
  }
}
