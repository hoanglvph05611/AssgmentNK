package com.lvh.assgment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.lvh.assgment.R;

public class GifsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gifs_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingActionButton fa1 = view.findViewById(R.id.action1);
        fa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Set As Wallpaer", Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton fa2 = view.findViewById(R.id.action2);
        fa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Save", Toast.LENGTH_SHORT).show();
            }
        });
        FloatingActionButton fa3 = view.findViewById(R.id.action3);
        fa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Share", Toast.LENGTH_SHORT).show();
            }
        });
        FloatingActionButton fa4 = view.findViewById(R.id.action4);
        fa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Heart", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void showToast(String message){
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
