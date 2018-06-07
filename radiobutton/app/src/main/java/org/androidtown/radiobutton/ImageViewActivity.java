package org.androidtown.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        // 이미지 리소스 디렉토리 구성

        // ldpi - low dpi
        // mdpi - mid dpi , 기준 해상도 (320 x 480) 실제 이미지의 1px이 화면의 1px과 같다.
        // hdpi - high dpi  - 실제 이미지의 1.5px은 화면의 1px로 보여진다.
        // xhdpi - 실제 2px이 화면에 1px로 보여진다.
        // xxhdpi - 갤럭시 7,8, 3px이 1px로 보여진다.
        // xxxhdpi - 노트 4px이 1px로 보여진다.

    }
}
