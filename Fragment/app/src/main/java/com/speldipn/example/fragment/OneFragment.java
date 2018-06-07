package com.speldipn.example.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

  Button btnNext;
  MainActivity activity = null;

  public OneFragment() {
    // 빈생성자가 필요
  }

  @Override
  public void onAttach(Context context) {
    // 파라미터 타입이 Context이지만 상위의 Activity 클래스가 담겨져 넘어온다.
    if(context instanceof MainActivity) {
      activity = (MainActivity) context;
    }

    super.onAttach(context);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_one, container, false);

    // 여기서 화면 처리. findviewbyId()와 같은..
    btnNext = view.findViewById(R.id.btnNext);
    btnNext.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(activity != null) {
          activity.next();
        }
      }
    });

    return view;
  }

}
