package com.virmond.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Ser feliz sem motivo é a mais autêntica forma de felicidade.",
                "Não existe um caminho para a felicidade. A felicidade é o caminho.",
                "Não espere por uma crise para descobrir o que é importante em sua vida.",
                "A alegria de fazer o bem é a única felicidade verdadeira.",
                "Pessimismo leva à fraqueza, otimismo ao poder."
        };

        int numero = new Random().nextInt(5);// 0 1 2 3 4

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );



    }

}
