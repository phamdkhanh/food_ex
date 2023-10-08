package com.example.food_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.food_ex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        Log.i("Activity: ", "onCreate");

        loadData();

    }
    private void loadData(){

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