package com.gustavorayo.customlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ArrayList<Color> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = getColors();

        ListView colorList = (ListView) findViewById(R.id.color_list);
        colorList.setAdapter(new CustomListAdapter(this, colors));
        colorList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),colors.get(i).getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public ArrayList<Color> getColors() {
        ArrayList<Color> colors=new ArrayList<Color>();
        Color blue = new Color("Blue","#0000FF");
        Color red = new Color("Red","#ff0000");
        Color green = new Color("green","#008000");
        colors.add(blue);
        colors.add(red);
        colors.add(green);
        return colors;
    }
}
