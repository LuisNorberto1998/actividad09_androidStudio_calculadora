package main.main.calculadora_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numUno;
    private EditText numDos;
    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numUno = (EditText) findViewById(R.id.editText_numeroUno);
        numDos = (EditText) findViewById(R.id.editText_numeroDos);
        resultado = (EditText) findViewById(R.id.editText_result);
    }

    public void operacionMultiplicacion(View view) {
        try {
            String valor1 = numUno.getText().toString();
            String valor2 = numDos.getText().toString();

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2);

            double multiplicacion = num1 * num2;

            String result = String.valueOf(multiplicacion);

            resultado.setText(result);
        } catch (Error e){
            Toast toast = Toast.makeText(this, R.string.t_error, Toast.LENGTH_SHORT);
        }

    }

    public void operacionSuma(View view) {
        String valor1 = numUno.getText().toString();
        String valor2 = numDos.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double suma = num1 + num2;

        String result = String.valueOf(suma);

        resultado.setText(result);

    }

    public void operacionModulo(View view) {
        String valor1 = numUno.getText().toString();
        String valor2 = numDos.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double modulo = num1 % num2;

        String result = String.valueOf(modulo);

        resultado.setText(result);

    }

    public void operacionResta(View view) {
        String valor1 = numUno.getText().toString();
        String valor2 = numDos.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double resta = num1 - num2;

        String result = String.valueOf(resta);

        resultado.setText(result);

    }

    public void operacionDivision(View view) {
        String valor1 = numUno.getText().toString();
        String valor2 = numDos.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double division = num1 / num2;

        String result = String.valueOf(division);

        resultado.setText(result);
    }
}
