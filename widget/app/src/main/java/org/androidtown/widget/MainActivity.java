package org.androidtown.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv1;
    TextView tv2;
    Button btnUp, btnRight, btnDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editText);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        btnUp = (Button) findViewById(R.id.btnUp);
        btnRight = (Button) findViewById(R.id.btnRight);
        btnDown = (Button) findViewById(R.id.btnDown);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;

                switch (view.getId()) {
                    case R.id.btnUp:
                        text = et.getText().toString();
                        tv1.setText(text.toString());
                        et.setText("");
                        break;

                    case R.id.btnRight:
                        text = tv1.getText().toString();
                        tv2.setText(text.toString());
                        tv1.setText("");
                        break;

                    case R.id.btnDown:
                        text = tv2.getText().toString();
                        et.setText(text);
                        tv2.setText("");
                        break;
                }
            }
        };

        btnUp.setOnClickListener(listener);
        btnRight.setOnClickListener(listener);
        btnDown.setOnClickListener(listener);

    }
}
