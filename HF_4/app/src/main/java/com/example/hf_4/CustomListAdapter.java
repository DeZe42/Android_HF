package com.example.hf_4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] priceArray;
    private final String[] infoArray;
    private final String[] buyArray;
    private final String[] sellArray;

    public CustomListAdapter(Activity context, String[] priceParam, String[] infoParam, String[] buyParam, String[] sellParam){

        super(context, R.layout.activity_custom_list_adapter, priceParam);
        this.context=context;
        this.priceArray = priceParam;
        this.infoArray = infoParam;
        this.buyArray = buyParam;
        this.sellArray = sellParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_custom_list_adapter, null,true);

        TextView price = (TextView) rowView.findViewById(R.id.penz);
        TextView info = (TextView) rowView.findViewById(R.id.info);
        TextView buy = (TextView) rowView.findViewById(R.id.vetel);
        TextView sell = (TextView) rowView.findViewById(R.id.eladas);

        price.setText(priceArray[position]);
        info.setText(infoArray[position]);
        buy.setText(buyArray[position]);
        sell.setText(sellArray[position]);

        return rowView;

    }
}