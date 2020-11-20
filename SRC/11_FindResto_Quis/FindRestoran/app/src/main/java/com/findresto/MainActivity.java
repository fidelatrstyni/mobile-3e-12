package com.findresto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.findresto.fragments.FavFragment;
import com.findresto.fragments.HomeFragment;
import com.findresto.fragments.LoginFragment;
import com.findresto.fragments.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity{

    //private HomeFragment homeFragment;
    //private LoginFragment loginFragment;
    //private FavFragment favFragment;
    //private UserFragment userFragment;
    //FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load_fragment_bottom(new HomeFragment());
        //BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        //bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }
    /*Boolean load_fragment_bottom(Fragment fragment) {
        if(fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.menu_home:
                fragment = new HomeFragment();
               break;
            case R.id.menu_fav:
                fragment = new FavFragment();
                break;
            case R.id.menu_user:
                fragment = new UserFragment();
                break;
        }
        return load_fragment_bottom(fragment);
    }*/
}