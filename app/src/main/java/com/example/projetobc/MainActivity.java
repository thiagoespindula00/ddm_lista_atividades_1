package com.example.projetobc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewQtdClicks;
    int qtdClicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewQtdClicks  = findViewById(R.id.qtdClicks);
        qtdClicks = 0;
    }

    public void setQtdClicks(View view) {
        qtdClicks++;
        textViewQtdClicks.setText(Integer.toString(qtdClicks));
    }
}