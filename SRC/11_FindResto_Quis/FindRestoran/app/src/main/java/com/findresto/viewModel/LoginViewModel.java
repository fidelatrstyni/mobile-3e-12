package com.findresto.viewModel;

import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.findresto.models.User;

import java.util.Objects;

public class LoginViewModel extends ViewModel {

    public User user = new User();
    private MutableLiveData<Boolean> isLoggedIn = new MutableLiveData<>();


    public void validateLogin(String email,String password){
        this.user.setUsername(email);
        this.user.setPassword(password);
        this.
                isLoggedIn.setValue(this.user.checkLogin(email,password));
    }

    public LiveData<Boolean> isLoggedIn(){
        return isLoggedIn;
    }

    public void onLoginNavigated(){
        this.isLoggedIn.setValue(null);
    }
}

