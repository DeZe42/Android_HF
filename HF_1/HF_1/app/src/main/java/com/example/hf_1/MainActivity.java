package com.example.hf_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.add);
        Button substract = (Button) findViewById(R.id.substract);
        Button szor = (Button) findViewById(R.id.szor);
        Button oszt = (Button) findViewById(R.id.oszt);
        final EditText val1 = (EditText) findViewById(R.id.val1);
        final EditText val2 = (EditText) findViewById(R.id.val2);
        final TextView result = (TextView) findViewById(R.id.sum);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(val1.getText().toString());
                int y = new Integer(val2.getText().toString());
                int sum = x + y;
                result.setText("Eredmeny " + x + " + " + y + " = " + sum);
            }
        });

        substract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(val1.getText().toString());
                int y = new Integer(val2.getText().toString());
                int sum = x - y;
                result.setText("Eredmeny " + x + " - " + y + " = " + sum);
            }
        });

        szor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(val1.getText().toString());
                int y = new Integer(val2.getText().toString());
                int sum = x / y;
                result.setText("Eredmeny " + x + " / " + y + " = " + sum);
            }
        });

        oszt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = new Integer(val1.getText().toString());
                int y = new Integer(val2.getText().toString());
                int sum = x * y;
                result.setText("Eredmeny " + x + " * " + y + " = " + sum);
            }
        });
    }
}