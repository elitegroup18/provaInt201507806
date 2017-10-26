package com.example.arqdsis.marcosteodoro;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.arqdsis.marcosteodoro.

import java.util.ArrayList;

public class Resultante extends MainActivity {

    int value, max, resul, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultante);


        Bundle extra = getIntent().getExtras();

        if ( extra != null) {
/**
 *
 *
 * Marcos V Teodoro 201507806
 *
 */
            String textoPassado = extra.getString("nome");

            String array[];
            array = textoPassado.split(";");

            value = Integer.parseInt(array[0]);
            max = Integer.parseInt(array[1]);

            ArrayList<String> tabuada;
            tabuada = new ArrayList<String>();
            c = 1;
            while((value * c) <= max){

                resul = value * c;

                tabuada.add(value + " X " + c + " = " + resul);
                c ++;
            }
/**
 *
 * Marcos V Teodoro 201507806
 *
 */

            ListView lista;
            lista = (ListView) findViewById(R.id.listview);
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, tabuada);
            lista.setAdapter( adaptador );
        }
        /**
         * Marcos V Teodoro 201507806
         *
         */
    }
}