package com.idnp.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;

public class Diagrama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagrama);
    }

    public class Barras extends View {

        public Barras(Context context){
            super(context);
        }

        protected void onDraw(Canvas canvas){

        }

    }
}