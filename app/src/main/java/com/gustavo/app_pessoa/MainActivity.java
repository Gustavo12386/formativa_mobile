package com.gustavo.app_pessoa;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastropessoa(View view){
        TextView texto = findViewById(R.id.textResultado);
        EditText editnome = findViewById(R.id.editNome);
        EditText editmes = findViewById(R.id.editMes);
        EditText editano = findViewById(R.id.editAno);
        EditText editsexo = findViewById(R.id.editSexo);
        String estacao = "";
        int idade;

        if(Integer.parseInt(String.valueOf(editmes.getText())) == 1 || Integer.parseInt(String.valueOf(editmes.getText())) == 2 ||
        Integer.parseInt(String.valueOf(editmes.getText())) == 12)
        {
            estacao = "Verao";
        }
        if(Integer.parseInt(String.valueOf(editmes.getText())) == 3 || Integer.parseInt(String.valueOf(editmes.getText())) == 4 ||
                Integer.parseInt(String.valueOf(editmes.getText())) == 5)
        {
            estacao = "Outono";
        }
        if(Integer.parseInt(String.valueOf(editmes.getText())) == 6 || Integer.parseInt(String.valueOf(editmes.getText())) == 7 ||
                Integer.parseInt(String.valueOf(editmes.getText())) == 8)
        {
            estacao = "Inverno";
        }
        if(Integer.parseInt(String.valueOf(editmes.getText())) == 9 || Integer.parseInt(String.valueOf(editmes.getText())) == 10 ||
                Integer.parseInt(String.valueOf(editmes.getText())) == 11)
        {
            estacao = "Primavera";
        }

        idade = 2023 - (Integer.parseInt(String.valueOf(editano.getText())));

        if(String.valueOf(editsexo.getText()).equals("Feminino")){
            texto.setText("Senhora" + editnome.getText() + "você tem" + idade + " , pois nasceu no"
            + estacao + "do ano" + editano.getText());
        } else{
            texto.setText("Senhor" + editnome.getText() + "você tem" + idade +" , pois nasceu no"
                    + estacao + "do ano" + editano.getText() );
        }
    }


}