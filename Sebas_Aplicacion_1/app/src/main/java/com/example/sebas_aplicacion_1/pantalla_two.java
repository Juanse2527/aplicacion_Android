package com.example.sebas_aplicacion_1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pantalla_two extends AppCompatActivity {

    TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_two);

        txtMensaje = findViewById(R.id.txtMensaje);


        String mensaje = getIntent().getStringExtra("mensaje");


        if (mensaje != null) {
            txtMensaje.setText(mensaje);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("pantalla_two", "Estoy en onResume");
    }
}
