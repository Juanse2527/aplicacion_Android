package com.example.sebas_aplicacion_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView nombreUsuario;
    Button btn1, btn2, btnIrASecondActivity;
    WebView webViewMain;
    String Tag = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario = findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnIrASecondActivity = findViewById(R.id.btnIrASecondActivity);
        webViewMain = findViewById(R.id.webViewMain);

        String mensajeDesdePantallaTwo = getIntent().getStringExtra("mensaje");

        if (mensajeDesdePantallaTwo != null) {
            nombreUsuario.setText(mensajeDesdePantallaTwo);
        }

        btn1.setOnClickListener(view -> nombreUsuario.setText(getString(R.string.presione_boton_uno)));
        btn2.setOnClickListener(view -> nombreUsuario.setText(getString(R.string.presione_boton_dos)));

        btnIrASecondActivity.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, pantalla_two.class)
                        .putExtra("mensaje", getString(R.string.hola_juan_sebastian)))
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Estoy en OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "Estoy en OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "Estoy en OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "Estoy en OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "Estoy en OnDestroy");
    }
}
