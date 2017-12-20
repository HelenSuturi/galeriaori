package com.example.probook.galeriaori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button crearr;
    Button detallee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crearr=(Button)findViewById(R.id.idcrear);

        crearr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent crearr=new Intent(MainActivity.this,galerry.class);
                startActivity(crearr);
            }
        });


        detallee=(Button)findViewById(R.id.iddetalle);
                detallee.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent editarr=new Intent(MainActivity.this,detalle.class);
                        startActivity(editarr);
                    }
                });
            }

    }

