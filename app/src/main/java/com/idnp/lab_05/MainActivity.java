package com.idnp.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner colores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colores = (Spinner) findViewById(R.id.ListColor);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ListaColores, android.R.layout.simple_spinner_item);
        colores.setAdapter(adapter);
    }

}