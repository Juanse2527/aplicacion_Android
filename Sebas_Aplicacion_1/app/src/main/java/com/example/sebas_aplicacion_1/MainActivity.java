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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Uno");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Dos");
            }
        });

        btnIrASecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, pantalla_two.class);


                intent.putExtra("mensaje", "Hola Juan Sebastian");


                startActivity(intent);
            }
        });
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
