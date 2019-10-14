package edu.temple.lab_4_app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    Context context;
    String colors[];

    public ColorAdapter(Context context, String colors[]){
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;

        if(view != null && view instanceof TextView)
            textView = (TextView) view;
        else
            textView = new TextView(context);

        //String colorValue = colors[i];
        //textView.setText(colorValue);

        Resources res = viewGroup.getResources();
        String[] ca = res.getStringArray(R.array.colors);
        textView.setText(ca[i]);

        textView.setBackgroundColor(Color.parseColor(colors[i]));
        textView.setTextSize(22);
        textView.setPadding(5,5,0,0);

        return textView;

    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View view = getView(position, convertView,parent);
        String colorValue = colors[position];

        view.setBackgroundColor(Color.parseColor(colorValue));
        return view;
    }
}