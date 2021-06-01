package com.vaibhavmojidra.livedatademojava;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.vaibhavmojidra.livedatademojava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainActivityViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainActivityViewModelFactory factory = new MainActivityViewModelFactory(1);
        model= new ViewModelProvider(this, factory).get(MainActivityViewModel.class);
        model.count.observe(this, integer -> binding.result.setText(String.valueOf(integer)));
        binding.increment.setOnClickListener(v -> model.updateCount());
    }
}