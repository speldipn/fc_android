package org.androidtown.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekbarActivity extends AppCompatActivity {

    TextView tv;
    SeekBar sb;
    View vi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        tv = findViewById(R.id.textView);
        sb = findViewById(R.id.seekBar);
        vi = findViewById(R.id.view);


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tv.setText(i + "");

                // T R G B
                // ff ff ff ff
                vi.setBackgroundColor(
                        0xFF000000 + (i * 0x10000)
                );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
