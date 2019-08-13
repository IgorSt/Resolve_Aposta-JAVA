package com.igorsantos.resolveaposta;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int numeroAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {

        TextView textoResultado2 = findViewById(R.id.textoResultado2);
        TextView textoResultado = findViewById(R.id.textoResultado1);

        int numeroAleatorio = new Random().nextInt(10);

        Integer n1 = new Integer(numeroAleatorio);
        String numeroAleatorioSt = n1.toString();

        textoResultado.setText("O número selecionado é: " + numeroAleatorio);

        EditText numero1 = (EditText) findViewById(R.id.escolhaNumero1);//cria a variavel "numero1" do tipo EditText, pegando o valor do campo "escolhaNumero1"
        String numero1St = numero1.getText().toString();//converte a variavel "numero1" do tipo EditText para o tipo String
        Integer numero1Int = Integer.valueOf(numero1St);//converte a variavel numero1St do tipo String para o tipo Int

        EditText numero2 = (EditText) findViewById(R.id.escolhaNumero2);
        String numero2St = numero2.getText().toString();
        Integer numero2Int = Integer.valueOf(numero2St);

        EditText nome1 = findViewById(R.id.nome1);
        String nome1St = nome1.getText().toString();
        EditText nome2 = findViewById(R.id.nome2);
        String nome2St = nome2.getText().toString();

        if(numero1Int == numeroAleatorio){

            AlertDialog.Builder dlg2 = new AlertDialog.Builder(this);
            dlg2.setMessage(nome1St + " acertou o número e ganhou a aposta!");
            dlg2.show();

        }else if(numero2Int == numeroAleatorio){

            AlertDialog.Builder dlg3 = new AlertDialog.Builder(this);
            dlg3.setMessage(nome2St + " acertou o número e ganhou a aposta!");
            dlg3.show();

        }else if(numero1Int != numeroAleatorio && numero2Int != numeroAleatorio){
            AlertDialog.Builder dlg4 = new AlertDialog.Builder(this);
            dlg4.setMessage("Ninguém acertou!");
            dlg4.show();
        }

    }
}
