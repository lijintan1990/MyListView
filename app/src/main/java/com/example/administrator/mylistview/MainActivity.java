package com.example.administrator.mylistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private String[] data = {"cat1", "cat2", "cat3", "cat4", "cat5", "cat6", "cat7", "cat8", "cat89"};
    private static final String TAG = "mylistview";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adpter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, data);

        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adpter);
    }
}
