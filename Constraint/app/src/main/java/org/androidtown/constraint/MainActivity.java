package org.androidtown.constraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView result;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result = findViewById(R.id.result);
        for (int i = 0; i < 10; ++i) {
            String viewName = "btn" + i;
            String packName = this.getPackageName(); // 패키지명
            int resID = getResources().getIdentifier(viewName, "id", packName);
            findViewById(resID).setOnClickListener(this);
        }

        findViewById(R.id.btnPlus).setOnClickListener(this);
        findViewById(R.id.btnMinus).setOnClickListener(this);
        findViewById(R.id.btnDivide).setOnClickListener(this);
        findViewById(R.id.btnClear).setOnClickListener(this);
        findViewById(R.id.btnMultiple).setOnClickListener(this);
        findViewById(R.id.btnEqual).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String temp = result.getText().toString();

        if (temp.equals("0")) {
            temp = "";
        }

        switch (view.getId()) {
            case R.id.btn0:
                result.setText("0");
                temp += "0";
                break;

            case R.id.btn1:
                result.setText("1");
                temp += "1";
                break;

            case R.id.btn2:
                result.setText("2");
                temp += "2";
                break;

            case R.id.btn3:
                result.setText("3");
                temp += "3";
                break;

            case R.id.btn4:
                result.setText("4");
                temp += "4";
                break;

            case R.id.btn5:
                result.setText("5");
                temp += "5";
                break;

            case R.id.btn6:
                result.setText("6");
                temp += "6";
                break;

            case R.id.btn7:
                result.setText("7");
                temp += "7";
                break;

            case R.id.btn8:
                result.setText("8");
                temp += "8";
                break;

            case R.id.btn9:
                result.setText("9");
                temp += "9";
                break;

            case R.id.btnPlus:
                operator = "+";
                temp += "+";
                break;

            case R.id.btnMinus:
                operator = "-";
                temp += "-";
                break;

            case R.id.btnDivide:
                operator = "/";
                temp += "/";
                break;

            case R.id.btnMultiple:
                operator = "*";
                temp += "*";
                break;

            case R.id.btnClear:
                temp = "0";
                break;

            case R.id.btnEqual:
                temp = calc(temp);
                break;
        }

        result.setText(temp);
    }

    public String calc(String temp) {
        String result = "";
        return result;

    }

//    public int getOperLevel(String oper) {
//        if (oper.equals("+") || oper.equals("-")) {
//            return 1;
//        } else if (oper.equals("*") || oper.equals("/")) {
//            return 2;
//        }
//    }


}
