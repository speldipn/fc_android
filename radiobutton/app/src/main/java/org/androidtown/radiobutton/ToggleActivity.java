package org.androidtown.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        ToggleButton tb = findViewById(R.id.toggleButton);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getBaseContext(), "체크되었습니다", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(), "체크가 해지되었습니다", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
