package com.speldipn.example.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

  Button btnBack;
  MainActivity activity = null;

  public TwoFragment() {
    // Required empty public constructor
  }

  @Override
  public void onAttach(Context context) {
    if (context instanceof MainActivity) {
      activity = (MainActivity) context;
    }

    super.onAttach(context);
  }

    @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_two, container, false);

    btnBack = view.findViewById(R.id.btnBack);
    btnBack.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(activity != null) {
          activity.back();
        }
      }
    });
    return view;
  }

}
