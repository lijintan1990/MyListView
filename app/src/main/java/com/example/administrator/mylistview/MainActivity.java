package com.example.administrator.mylistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.modle.Cat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<Cat> catList = new ArrayList<Cat>();
    private String[] data = {"cat1", "cat2", "cat3", "cat4", "cat5", "cat6", "cat7", "cat8", "cat89"};
    private static final String TAG = "mylistview";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCat();
        ArrayAdapter<String> adpter = new CatAdapter(MainActivity.this,
                R.layout.cat_item, catList);

        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adpter);
    }

    private void initCat() {
        Cat cat1 = new Cat("cat1", R.drawable.dahuangmao01);
        catList.add(cat1);
        Cat cat2 = new Cat("cat2", R.drawable.dahuangmao02);
        catList.add(cat2);
        Cat cat3 = new Cat("cat3", R.drawable.dahuangmao03);
        catList.add(cat3);
        Cat cat4 = new Cat("cat4", R.drawable.dahuangmao04);
        catList.add(cat4);
        Cat cat5 = new Cat("cat5", R.drawable.dahuangmao05);
        catList.add(cat1);
        Cat cat6 = new Cat("cat6", R.drawable.dahuangmao06);
        catList.add(cat6);
        Cat cat7 = new Cat("cat7", R.drawable.dahuangmao07);
        catList.add(cat7);
        Cat cat8 = new Cat("cat8", R.drawable.dahuangmao08);
        catList.add(cat4);
    }
}
