package io.ermdev.classify.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.ermdev.classify.R;

public class MainActivity extends AppCompatActivity implements MainScreen {

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        presenter = new MainPresenter(this);
    }
}
