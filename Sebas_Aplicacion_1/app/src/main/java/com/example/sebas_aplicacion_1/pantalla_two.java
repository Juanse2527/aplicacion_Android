package com.example.sebas_aplicacion_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class pantalla_two extends AppCompatActivity {

    Button volver;
    TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_two);

        txtMensaje = findViewById(R.id.usuario);
        volver = findViewById(R.id.btnvolver);

        String mensaje = getIntent().getStringExtra("mensaje");

        if (mensaje != null) {
            txtMensaje.setText(mensaje);
        }

        volver.setOnClickListener(view ->
                startActivity(new Intent(pantalla_two.this, MainActivity.class)
                        .putExtra("mensaje", getString(R.string.volviendo_de_pantalla_dos)))
        );
    }
}
