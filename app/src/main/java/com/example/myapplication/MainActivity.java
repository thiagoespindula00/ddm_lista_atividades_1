package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextValorMinino;
    EditText editTextValorMaximo;
    TextView textViewValorSorteado;
    Button buttonSorteia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValorMinino   = findViewById(R.id.valor1);
        editTextValorMaximo   = findViewById(R.id.valor2);
        textViewValorSorteado = findViewById(R.id.valorSorteado);
        buttonSorteia         = findViewById(R.id.btn_Sortear);
    }

    public void sorteia(View view) {

        if (!valoresSaoValidos())
            return;

        int valorMinimo = Integer.parseInt(editTextValorMinino.getText().toString().trim());
        int valorMaximo = Integer.parseInt(editTextValorMaximo.getText().toString().trim());

        textViewValorSorteado.setText(String.valueOf(Sorteador.sorteia(valorMinimo, valorMaximo)));
    }

    private boolean valoresSaoValidos() {
        if (editTextValorMinino.getText().toString().trim().equalsIgnoreCase("")){
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.digite_o_valor_minino), Toast.LENGTH_LONG).show();
            return false;
        }

        if (editTextValorMaximo.getText().toString().trim().equalsIgnoreCase("")){
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.digite_o_valor_maximo), Toast.LENGTH_LONG).show();
            return false;
        }

        int valorMinimo = Integer.parseInt(editTextValorMinino.getText().toString().trim());
        int valorMaximo = Integer.parseInt(editTextValorMaximo.getText().toString().trim());

        if (valorMinimo > valorMaximo) {
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.valor_minimo_nao_pode_ser_maior_que_valor_maximo), Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }
}