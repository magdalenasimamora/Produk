package com.oods.produk.Pembeli;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.oods.produk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnDetail = view.findViewById(R.id.btnDetail);
        Button btnDetail1 = view.findViewById(R.id.btnDetail1);

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetail();
            }
        });

        btnDetail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetail();
            }
        });

        return view;
    }

    private void openDetail(){
        Intent intent = new Intent(this.getContext(), Detail.class);
        startActivity(intent);
    }

}
