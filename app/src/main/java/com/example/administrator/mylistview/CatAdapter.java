package com.example.administrator.mylistview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.administrator.modle.Cat;

import java.util.List;

public class CatAdapter extends ArrayAdapter{
    private final int resourceId;

    public CatAdapter(Context context, int textViewResouceId, List<Cat> objects) {
        super(context, textViewResouceId, objects);
        resourceId = textViewResouceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Cat cat = (Cat) getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
    }
}
