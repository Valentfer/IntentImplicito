package com.example.intentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.intentimplicito.databinding.ActivityMainBinding;
import com.example.intentimplicito.databinding.ActivityMainContactoInsertadoBinding;

public class MainActivityContactoInsertado extends AppCompatActivity {

    private ActivityMainContactoInsertadoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contacto_insertado);
    }
}