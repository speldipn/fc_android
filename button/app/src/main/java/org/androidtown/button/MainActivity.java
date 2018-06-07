package org.androidtown.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnClick1;
    Button btnClick2;
    Button btnClick3;
    Button btnClick4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick1 = (Button) findViewById(R.id.click1);
        //1. 리스너를 익명클래스로 만들어서 등록.
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Click me 1", Toast.LENGTH_SHORT).show();
            }
        };
        btnClick1.setOnClickListener(listener);

        //2. 리스너 익명클래스를 직접 등록.
        btnClick2 = (Button) findViewById(R.id.click2);
        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Click me 2", Toast.LENGTH_SHORT).show();
            }
        });

        //3. 리스너 인터페이스를 클래스에 구현
        btnClick3 = (Button) findViewById(R.id.click3);
        btnClick3.setOnClickListener(this);

        //4. 함수를 화면 xml에 직접 호출

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getBaseContext(), "Click me 3", Toast.LENGTH_SHORT).show();
    }

    public void onClick4(View view) {
        Toast.makeText(getBaseContext(), "Click me 4", Toast.LENGTH_SHORT).show();
    }
}