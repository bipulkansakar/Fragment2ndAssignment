package com.bipulproject.fragment2ndassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bipulproject.fragment2ndassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutoMorphic extends Fragment implements View.OnClickListener {

    private Button btnAutoMorphic;
    private EditText etNumber;



    public AutoMorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_auto_morphic, container, false);

        etNumber = view.findViewById(R.id.etNumber);
        btnAutoMorphic = view.findViewById(R.id.btnAutoMorphic);

        btnAutoMorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int a,s,c=1;
        int number = Integer.parseInt(etNumber.getText().toString());

        a=number;

        s=number*number;

        while (number!=0)

        {

            c=c*10;

            number=number/10;

        }

        if(s%c==a)
            Toast.makeText(getActivity(),"The number is AutoMorphic.", Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(getActivity(),"The number is not AutoMorphic.",Toast.LENGTH_SHORT).show();


    }
}
