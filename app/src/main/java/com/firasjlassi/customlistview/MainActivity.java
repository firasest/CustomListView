package com.firasjlassi.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    protected ListView maListViewPerso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maListViewPerso =findViewById(R.id.listviewperso);

        ArrayList <HashMap <String, String> > ListView = new ArrayList<>();

        HashMap <String , String> map;

        map =new HashMap<>();

        map.put("titre","word");
        map.put("img",String.valueOf(R.drawable.word));
        ListView.add(map);
    }
}
