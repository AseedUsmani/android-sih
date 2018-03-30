package com.example.dell.chestx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DELL on 31-Mar-18.
 */


public class ListAdapter extends ArrayAdapter<ModelClass> {

    List<ModelClass> dataSet;
    Context mContext;

    public ListAdapter(Context context, List<ModelClass> items) {
        super(context, R.layout.list_item, items);
        this.mContext = context;
        this.dataSet = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_item, null);
        }

        ModelClass p = getItem(position);

        if (p != null) {
            TextView disease = (TextView) v.findViewById(R.id.disease);
            TextView doc_id = (TextView) v.findViewById(R.id.doc_id);

            if (disease != null) {
                disease.setText(p.getDisease());
            }

            if (doc_id != null) {
                doc_id.setText(p.getDoc_id());
            }
        }

        return v;
    }
}
