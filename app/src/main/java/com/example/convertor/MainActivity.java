package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void btnClick(View view ){
        EditText dollar = (EditText)findViewById(R.id.dollarAmount);
        String dollars = ((EditText) findViewById(R.id.dollarAmount)).getText().toString();
        Double doubleDollars = Double.parseDouble(dollars);
        Double doubleInr = 71*72 *doubleDollars;
        String toastText = "= " + doubleInr.toString() + " $";
        Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}