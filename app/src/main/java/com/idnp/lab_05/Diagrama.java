package com.idnp.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Diagrama extends AppCompatActivity {

    String [] nombres;
    String [] valores;
    double [] valoresDouble;
    String color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Barras(this));

        Bundle datos = getIntent().getExtras();
        nombres = datos.getStringArray("Nombres");
        valores = datos.getStringArray("Valores");
        valoresDouble = new double[]{Integer.parseInt(valores[0]),
                Integer.parseInt(valores[1]),
                Integer.parseInt(valores[2]),
                Integer.parseInt(valores[3])};
        color = datos.getString("Color");
    }

    public class Barras extends View {

        public Barras(Context context){
            super(context);
        }

        protected void onDraw(Canvas canvas){
            Paint pincel = new Paint();
            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(2);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawRect(50, 100, 1000, 800, pincel);
            canvas.drawLine(150, 700, 950, 700, pincel);
            pincel.setStrokeWidth(3);
            pincel.setTextSize(40);
            pincel.setTextAlign(Paint.Align.CENTER);
            canvas.drawText("Nombre populares de mascotas",475, 150, pincel);
            pincel.setTextSize(30);
            pincel.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText("0",120, 710, pincel);
            canvas.drawText("20",120, 610, pincel);
            canvas.drawText("40",120, 510, pincel);
            canvas.drawText("60",120, 410, pincel);
            canvas.drawText("80",120, 310, pincel);
            canvas.drawText("100",120, 210, pincel);
        }

    }
}