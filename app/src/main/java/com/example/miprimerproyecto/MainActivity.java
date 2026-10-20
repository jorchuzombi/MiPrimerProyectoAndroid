package com.example.miprimerproyecto;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Android elige automáticamente layout/ o layout-land/ según la orientación
        setContentView(R.layout.activity_main);

        Button botonEntrar = findViewById(R.id.botonEntrar);
        botonEntrar.setOnClickListener(v ->
                Toast.makeText(this, R.string.mensaje_entrar, Toast.LENGTH_SHORT).show());
    }
}
