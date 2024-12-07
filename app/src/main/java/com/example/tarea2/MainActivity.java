package com.example.tarea2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    /**
     * Creamos una variable en la que el número será el tiempo de espera de la imagen splash
     */
    public static int tiempoCarga = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
/**
 * * Handler para retrasar la ejecución de una tarea. */

        new Handler().postDelayed(new Runnable() {
            @Override
/**
 * * Método que se ejecuta después del retraso. */
            public void run() {
                /**
                 * * Inicia la actividad Aplication
                 * * * @param intent Intent para iniciar la nueva actividad. */
                Intent intent = new Intent(MainActivity.this, Aplication.class);
                startActivity(intent);
                finish();
            }
        }, tiempoCarga);
    }
}