package com.example.intentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;

import com.example.intentimplicito.databinding.ActivityMainDatosBinding;

public class MainActivityDatos extends AppCompatActivity {

    private ActivityMainDatosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainDatosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       binding.btnIns.setOnClickListener(view -> insertarContacto());

    }

    public void insertarContacto() {

        String nombre = binding.etxNombre.getText().toString();
        String telefono = binding.etxTelf.getText().toString();
        String mail = binding.etxMail.getText().toString();

        Intent intent = new Intent(Intent.ACTION_INSERT);
        //Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
        intent.putExtra(ContactsContract.Intents.Insert.NAME, nombre);
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, "34" + telefono);
        intent.putExtra(ContactsContract.Intents.Insert.EMAIL, mail);
        startActivity(intent);


    }

}