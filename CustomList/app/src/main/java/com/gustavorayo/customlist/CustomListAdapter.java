package com.gustavorayo.customlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Activity mActivity;
    private LayoutInflater inflater;
    private List<Color> mColors;

    public CustomListAdapter(Activity activity, List<Color> colors) {
        this.mActivity = activity;
        this.mColors = colors;
    }

    @Override
    public int getCount() {
        return mColors.size();
    }

    @Override
    public Object getItem(int location) {
        return mColors.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) mActivity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.color_item, null);

        Color color = mColors.get(position);

        TextView name = (TextView) convertView.findViewById(R.id.color_text);
        View box = (View) convertView.findViewById(R.id.color_box);

        name.setText(color.getName());
        box.setBackgroundColor(android.graphics.Color.parseColor(color.getCode()));

        return convertView;
    }

}