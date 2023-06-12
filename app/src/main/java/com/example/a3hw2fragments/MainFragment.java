package com.example.a3hw2fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainFragment extends Fragment {
    Button btDecrease, btIncrease,btReset;
    TextView tvCount;
    int counter =0 ;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init();
        setListener();
    }


    private void init() {
        btDecrease = requireActivity().findViewById(R.id.btDecrease);
        btIncrease = requireActivity().findViewById(R.id.btIncrease);
        btReset = requireActivity().findViewById(R.id.btReset);
        tvCount = requireActivity().findViewById(R.id.tvCount);

    }
    private void setListener() {
        btDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = Integer.parseInt((String)tvCount.getText());
                counter  --;
                tvCount.setText("" +counter);

            }
        });

        btIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = Integer.parseInt((String)tvCount.getText());
                counter  ++;
                tvCount.setText("" +counter);

            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = Integer.parseInt((String)tvCount.getText());
                counter  =0;
                tvCount.setText("" +counter);
            }
        });
    }


}