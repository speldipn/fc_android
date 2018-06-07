package org.androidtown.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                String name = null;
                switch (checkedId) {
                    case R.id.orange:
                        name = "오렌지";
                        break;
                    case R.id.banana:
                        name = "바나나";
                        break;
                    case R.id.apple:
                        name = "사과";
                        break;
                }
                Toast.makeText(getBaseContext(), name + " 선택되었습니다.", Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
