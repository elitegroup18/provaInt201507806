package com.example.arqdsis.marcosteodoro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity {

    private Button botao;
    private EditText tabuada;
    private EditText ate;



    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);
        tabuada = (EditText) findViewById(R.id.num_tabuada);
        ate = (EditText) findViewById(R.id.lim_tabuada);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /**
                 * Marcos V Teodoro 201507806
                 *
                 */
                Intent intent = new Intent (MainActivity.this, Resultante.class);
                intent.putExtra("nome", "2;2");
                startActivity(intent);

            }
        });
    }
}