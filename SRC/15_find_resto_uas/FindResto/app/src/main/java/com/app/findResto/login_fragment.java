package com.app.findResto;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.findResto.databinding.FragmentLoginFragmentBinding;
import com.app.findResto.viewModel.LoginViewModel;


public class login_fragment extends Fragment {

    private FragmentLoginFragmentBinding fragmentLoginFragmentBinding;
    private LoginViewModel loginViewModel;

    public login_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentLoginFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login_fragment,container,false);
        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        fragmentLoginFragmentBinding.setViewModel(loginViewModel);
        fragmentLoginFragmentBinding.setLifecycleOwner(this);
        return fragmentLoginFragmentBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentLoginFragmentBinding.getViewModel().isLoggedIn().observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                if(aBoolean!=null){
                    if(aBoolean){
                        NavDirections action =
                                login_fragmentDirections.actionLoginFragmentToSelamatDatang(loginViewModel.user);
                        Navigation.findNavController(view).navigate(action);
                        loginViewModel.onLoginNavigated();
                    }
                }
            }
        });
    }


}