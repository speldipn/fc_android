package org.androidtown.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 가. 체크박스가 하나일 때
        CheckBox cb = findViewById(R.id.checkBox);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if(checked) {
                    Toast.makeText(getBaseContext(), "Checked!!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getBaseContext(), "Not check!!", Toast.LENGTH_LONG).show();
                }
            }
        });

        // 나. 체크박스가 하나 이상일 때
        CheckBox orange = findViewById(R.id.orange);
        CheckBox banana = findViewById(R.id.banana);
        CheckBox apple = findViewById(R.id.apple);

        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                String itemName = null;
                switch (compoundButton.getId()) {
                    case R.id.orange:
                        itemName = "오렌지";
                        break;
                    case R.id.banana:
                        itemName = "바나나";
                        break;
                    case R.id.apple:
                        itemName = "사과";
                        break;
                }
                if(checked) {
                    itemName = itemName + " Checked!!";
                    Toast.makeText(getBaseContext(), itemName, Toast.LENGTH_LONG).show();
                } else {
                    itemName = itemName + " Not check!!";
                    Toast.makeText(getBaseContext(), itemName, Toast.LENGTH_LONG).show();
                }
            }
        };
        orange.setOnCheckedChangeListener(listener);
        banana.setOnCheckedChangeListener(listener);
        apple.setOnCheckedChangeListener(listener);

    }
}
