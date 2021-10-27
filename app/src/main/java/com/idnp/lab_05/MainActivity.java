package com.idnp.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner colores;
    EditText et1, et2, et3, et4, en1, en2, en3, en4;
    Button btn1;
    String [] nombres;
    String [] valores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colores = (Spinner) findViewById(R.id.ListColor);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        en1 = (EditText) findViewById(R.id.en1);
        en2 = (EditText) findViewById(R.id.en2);
        en3 = (EditText) findViewById(R.id.en3);
        en4 = (EditText) findViewById(R.id.en4);
        btn1 = (Button) findViewById(R.id.btn1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ListaColores, android.R.layout.simple_spinner_item);
        colores.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle datos = new Bundle();
                nombres = new String[]{et1.getText().toString(),
                                        et2.getText().toString(),
                                        et3.getText().toString(),
                                        et4.getText().toString()};

                valores = new String[]{en1.getText().toString(),
                                        en2.getText().toString(),
                                        en3.getText().toString(),
                                        en4.getText().toString()};

                datos.putStringArray("Nombres", nombres);
                datos.putStringArray("Valores", valores);
                datos.putString("Color", colores.getSelectedItem().toString());

                Intent intent = new Intent(getApplicationContext(), Diagrama.class);
                intent.putExtras(datos);
                startActivity(intent);
            }
        });
    }

}