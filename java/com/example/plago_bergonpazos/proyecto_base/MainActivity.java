package com.example.plago_bergonpazos.proyecto_base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    Button boton = (Button) findViewById(R.id.boton);
    TextView texto = (TextView) findViewById(R.id.texto);

    public void onClick(View x){

     texto.setText("HOLIIIIIIi");
    }
}
