package com.example.ampersandbox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    private ListView listView;
    private AmpAdapter mAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

//    public int AddAmp(View view) {
//        LinearLayout ampListLayout = (LinearLayout) view.findViewById(R.id.ampList);
//        TableLayout newAmp = (TableLayout) getLayoutInflater().inflate(R.layout.amp_layout, null);
//
//        int newAmpId = View.generateViewId();
//        newAmp.setId(newAmpId);
//
//        TextView t1 = newAmp.findViewById(R.id.dial1).findViewById(R.id.dialText);
//        t1.setText("1");
//
//        TextView t2 = newAmp.findViewById(R.id.dial2).findViewById(R.id.dialText);
//        t2.setText("2");
//
//        TextView t3 = newAmp.findViewById(R.id.dial3).findViewById(R.id.dialText);
//        t3.setText("3");
//
//        TextView t4 = newAmp.findViewById(R.id.dial4).findViewById(R.id.dialText);
//        t4.setText("4");
//
//        TextView t5 = newAmp.findViewById(R.id.dial5).findViewById(R.id.dialText);
//        t5.setText("5");
//
//        // TODO: hook up the delete button click event for each amp
//
//        ampListLayout.addView(newAmp);
//
//        return newAmpId;
//    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });

        listView = (ListView) view.findViewById(R.id.ampList);
        ArrayList<Amp> ampsList = new ArrayList<>();
        ampsList.add(new Amp(8));

        mAdapter = new AmpAdapter(this.getContext(), ampsList);
        listView.setAdapter(mAdapter);

        //int amp1Id = AddAmp(view);
        //int amp2Id = AddAmp(view);
        //int amp3Id = AddAmp(view);

//        FloatingActionButton addAmpButton = view.findViewById(R.id.addAmpButton);
//        addAmpButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View floatingActionButton) {
//                int newAmpId = AddAmp(view);
//                Snackbar.make(floatingActionButton, "New amp added!", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
}