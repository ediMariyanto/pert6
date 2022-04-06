package com.edi.pert6.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.edi.pert6.R;

public class HomeFragment extends Fragment {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initComponent(view);
        return view;
    }


    void initComponent(View view){
        btn = view.findViewById(R.id.btn_input_home);
        btn.setOnClickListener(view1 -> Toast.makeText(getContext(), "Coba cetak", Toast.LENGTH_LONG).show());
    }

}