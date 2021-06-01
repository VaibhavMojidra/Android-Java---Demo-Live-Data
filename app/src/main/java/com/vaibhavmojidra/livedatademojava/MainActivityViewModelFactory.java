package com.vaibhavmojidra.livedatademojava;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import org.jetbrains.annotations.NotNull;

public class MainActivityViewModelFactory implements ViewModelProvider.Factory {

    private int startingValue;
    public MainActivityViewModelFactory(int startingValue) {
        this.startingValue=startingValue;
    }

    @NonNull
    @NotNull
    @Override
    public <T extends ViewModel> T create(@NonNull @NotNull Class<T> modelClass) {
        return (T)new MainActivityViewModel(startingValue);
    }
}
