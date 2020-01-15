package com.example.droneapp.ui.vuelos_pendientes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.droneapp.R;

public class VuelosPendientesFragment extends Fragment {

    private VuelosPendientesViewModel vuelosPendientesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vuelosPendientesViewModel =
                ViewModelProviders.of(this).get(VuelosPendientesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_vuelos_pendientes, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);
        vuelosPendientesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}