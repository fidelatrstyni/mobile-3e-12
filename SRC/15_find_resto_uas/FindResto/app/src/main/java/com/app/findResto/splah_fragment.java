package com.app.findResto;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.findResto.databinding.FragmentSplahFragmentBinding;

public class splah_fragment extends Fragment {

    public splah_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSplahFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_splah_fragment, container, false);
        binding.setLifecycleOwner(this);
        final View view = binding.getRoot();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Navigation.findNavController(view).navigate(R.id.action_splah_fragment_to_login_fragment);
            }
        }, 3000);
        return view;
    }
}