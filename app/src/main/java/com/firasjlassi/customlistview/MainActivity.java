package com.firasjlassi.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    protected ListView maListViewPerso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maListViewPerso =findViewById(R.id.listviewperso);

        ArrayList <HashMap <String, String> > listIem = new ArrayList<>();

        HashMap <String , String> map;

        map =new HashMap<>();
        map.put("titre","Word");
        map.put("description","Editeur de texte");
        map.put("img",String.valueOf(R.drawable.word));
        listIem.add(map);

        map =new HashMap<>();
        map.put("titre","Excel");
        map.put("description","Tableur");
        map.put("img",String.valueOf(R.drawable.excel));
        listIem.add(map);

        map =new HashMap<>();
        map.put("titre","PowerPoint");
        map.put("description","Logiciel de presentation");
        map.put("img",String.valueOf(R.drawable.powerpoint));
        listIem.add(map);

        map =new HashMap<>();
        map.put("titre","Outlook");
        map.put("description","Client de courrier electronique");
        map.put("img",String.valueOf(R.drawable.outlook));
        listIem.add(map);


        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listIem,
                R.layout.activity_list_item,
                new String[]{"titre", "description", "img"},
                new int[]{R.id.titre, R.id.description, R.id.img});
        maListViewPerso.setAdapter(adapter);

        maListViewPerso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
