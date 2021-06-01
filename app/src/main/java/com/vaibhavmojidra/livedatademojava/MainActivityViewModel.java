package com.vaibhavmojidra.livedatademojava;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    MutableLiveData<Integer> count=new MutableLiveData(0);

    public MainActivityViewModel(int count) {
        this.count.setValue(count);
    }

    public int updateCount(){
        count.setValue(count.getValue()+1);
        return count.getValue();
    }
}
