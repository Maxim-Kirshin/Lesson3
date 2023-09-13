package ru.mirea.kirshin.com.example.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Fragment firstFragment, secondFragment;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
    }
    public void onClick(View view) {
        fragmentManager = getSupportFragmentManager();
        switch (view.getId()){
            case R.id.btnFirstFragment:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, firstFragment).commit();
                break;
            case R.id.btnSecondFragment:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, secondFragment).commit();
                break;
            default:
                break;
        }
    }
}