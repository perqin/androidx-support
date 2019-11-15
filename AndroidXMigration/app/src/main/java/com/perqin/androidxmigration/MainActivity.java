package com.perqin.androidxmigration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.perqin.lib.LibFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new LibFragment(), null)
                .commit();
    }
}
