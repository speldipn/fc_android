package com.speldipn.example.fragment;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  OneFragment one;
  TwoFragment two;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // 트랜잭션을 이용한 프로그래먼트 전환.
    one = new OneFragment();
    two = new TwoFragment();

    // 1. 프래그먼트 매니저 가져오기.
    FragmentManager manager = getSupportFragmentManager();

    // 2. 트랜잭션 시작하기
    // begin - 처리 - commit
    FragmentTransaction transaction = manager.beginTransaction();

    // 3. 프래그먼트 삽입처리
    transaction.add(R.id.frameLayout, one);

    // 4. 트랜잭션 완료처리. -> 프로그래먼트가 액티비티 화면에 주입된다.
    transaction.commit();

  }

  // 프래그먼트 two를 표시하는 함수.
  public void next() {
    // 1. 프래그먼트 매니저 가져오기.
    FragmentManager manager = getSupportFragmentManager();

    // 2. 트랜잭션 시작하기
    // begin - 처리 - commit
    FragmentTransaction transaction = manager.beginTransaction();

    // 3. 프래그먼트 삽입처리
    transaction.add(R.id.frameLayout, two);

    // 4. 프래그먼트를 backstack에 담아서 뒤로가기를 할 수 있게 만든다.
    transaction.addToBackStack(null);

    // 4. 트랜잭션 완료처리. -> 프로그래먼트가 액티비티 화면에 주입된다.
    transaction.commit();

  }

  public void back() {
    super.onBackPressed();
  }
}
