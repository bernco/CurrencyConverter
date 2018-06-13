package com.example.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create the conversion method when the convert button is clicked
    public void convertCurrency (View view){
        EditText euroCurrencyInput  = findViewById(R.id.editTextCurrency);
        String euroCurrencyGotten = euroCurrencyInput.getText().toString();

        //convert string to double
        Double euroCurrencyGottenDouble = Double.parseDouble(euroCurrencyGotten);

        //multiply by convertion rate
        Double nairaCurrencyConverted = euroCurrencyGottenDouble * 424;

        //display a toast of converted amount
        Toast.makeText(this, "N" +String.format("%.2f", nairaCurrencyConverted), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
