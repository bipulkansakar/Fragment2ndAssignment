package com.bipulproject.fragment2ndassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bipulproject.fragment2ndassignment.Fragments.AreaofCircle;
import com.softwarica.secondassignment.Fragments.AreaofCircle;
import com.softwarica.secondassignment.Fragments.Armstrong;
import com.softwarica.secondassignment.Fragments.Automorphic;
import com.softwarica.secondassignment.Fragments.Palindrome;
import com.softwarica.secondassignment.Fragments.SimpleInterest;
import com.softwarica.secondassignment.Fragments.Swapping;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAreaofCircle, btnPalindrome, btnSimpleInterest, btnArmstrong,
            btnAutoMorphic, btnSwapping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAreaofCircle = findViewById(R.id.btnAreaofCircle);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutoMorphic = findViewById(R.id.btnAutoMorphic);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnAreaofCircle.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSimpleInterest.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAutoMorphic.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnAreaofCircle:

                AreaofCircle areaofCircle = new AreaofCircle();
                fragmentTransaction.replace(R.id.fragmentContainer,areaofCircle);
                fragmentTransaction.commit();
                break;
        }

        switch (v.getId()) {
            case R.id.btnPalindrome:

                btnPalindromeNo palindrome = new palindromeNo();
                fragmentTransaction.replace(R.id.fragmentContainer,palindrome);
                fragmentTransaction.commit();
                break;
        }

        switch (v.getId()) {
            case R.id.btnSimpleInterest:

                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.fragmentContainer,simpleInterest);
                fragmentTransaction.commit();
                break;
        }

        switch (v.getId()) {
            case R.id.btnArmstrong:

                Armstrong armstrong = new Armstrong();
                fragmentTransaction.replace(R.id.fragmentContainer,armstrong);
                fragmentTransaction.commit();
                break;
        }

        switch (v.getId()) {
            case R.id.btnAutomorphic:

                Automorphic automorphic = new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphic);
                fragmentTransaction.commit();
                break;
        }

        switch (v.getId()) {
            case R.id.btnSwapping:

                Swapping swapping = new Swapping();
                fragmentTransaction.replace(R.id.fragmentContainer,swapping);
                fragmentTransaction.commit();
                break;
        }


    }
}
