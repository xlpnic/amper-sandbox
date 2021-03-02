package com.example.ampersandbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AmpAdapter extends ArrayAdapter<Amp> {

    private Context mContext;
    private List<Amp> ampsList = new ArrayList<>();

    public AmpAdapter(@NonNull Context context, ArrayList<Amp> list) {
        super(context, 0 , list);
        mContext = context;
        ampsList = list;
    }

    // helpful page: https://medium.com/mindorks/custom-array-adapters-made-easy-b6c4930560dd

    // another: https://abhiandroid.com/ui/listview 

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.amp_layout,parent,false);

        Amp currentAmp = ampsList.get(position);

        TextView ampDial1Value = (TextView)listItem.findViewById(R.id.dial1).findViewById(R.id.dialText);
        int dial1Value = currentAmp.getDial1Value();
        ampDial1Value.setText(dial1Value);

        TextView t2 = (TextView)listItem.findViewById(R.id.dial2).findViewById(R.id.dialText);
        t2.setText("2");

        TextView t3 = (TextView)listItem.findViewById(R.id.dial3).findViewById(R.id.dialText);
        t3.setText("3");

        TextView t4 = (TextView)listItem.findViewById(R.id.dial4).findViewById(R.id.dialText);
        t4.setText("4");

        TextView t5 = (TextView)listItem.findViewById(R.id.dial5).findViewById(R.id.dialText);
        t5.setText("5");

        return listItem;
    }
}
