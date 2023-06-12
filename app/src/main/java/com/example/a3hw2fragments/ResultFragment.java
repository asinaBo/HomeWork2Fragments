package com.example.a3hw2fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ResultFragment extends Fragment {



    public ResultFragment() {
        // Required empty public constructor
    }


    //public static ResultFragment newInstance(String param1, String param2) {
       // ResultFragment fragment = new ResultFragment();
        //return

   // }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }
}