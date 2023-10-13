package com.example.food_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.food_ex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        Log.i("Activity: ", "onCreate");


        addEvents();

    }
    private void addEvents(){
    binding.imbBreakdast.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, SangActivity.class);

            startActivity(intent);
        }
    });
    binding.imbLunch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, TruaActivity.class);
            startActivity(intent);
        }
    });
    binding.imbDinner1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ChieuActivity.class);
            startActivity(intent);
        }
    });
    binding.imbDinner2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ToiActivity.class);
            startActivity(intent);
        }
    });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity: ", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity: ", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity: ", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity: ", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity: ", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}