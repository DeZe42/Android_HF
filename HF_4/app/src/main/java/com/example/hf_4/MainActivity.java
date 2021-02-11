package com.example.hf_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] price = {
            "EUR",
            "USD",
            "GBP",
            "AUD"
    };

    String[] info = {
            "Euro",
            "Dollar American",
            "Lira",
            "Dollar Australian"
    };

    String[] buy = {
            "4.8800 RON",
            "4.5620 RON",
            "6.9650 RON",
            "3.9800 RON"
    };

    String[] sell = {
            "4.9900 RON",
            "3.6850 RON",
            "5.4550 RON",
            "4.6600 RON"
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever = new CustomListAdapter(this, price, info, buy, sell);
        listView = findViewById(R.id.listviewID);
        listView.setAdapter(whatever);
    }
}