package com.example.administrator.mylistview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.modle.Cat;

import java.util.List;

public class CatAdapter extends ArrayAdapter{
    private final int resourceId;

    public CatAdapter(Context context, int textViewResouceId, List<Cat> objects) {
        super(context, textViewResouceId, objects);
        resourceId = textViewResouceId;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        Cat cat = (Cat) getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        TextView catName = (TextView)view.findViewById(R.id.cat_name);
        ImageView catImage = (ImageView)view.findViewById(R.id.cat_image);

        catImage.setImageResource(cat.getImageid());
        catName.setText(cat.getname());
        return view;
    }
}
