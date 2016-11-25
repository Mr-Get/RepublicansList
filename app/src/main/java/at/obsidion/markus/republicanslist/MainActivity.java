package at.obsidion.markus.republicanslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Republican> listRepublicans;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myRepublicanList);

        listRepublicans = new ArrayList<>();
        listRepublicans.add(new Republican("Donald Trump","1600 Pennsylvania Ave NW, Washington, DC 20500, USA", "+1 202-456-1111","70", "3400000"));
        listRepublicans.add(new Republican("Peter Griffin","493 Centennial Farm Road, Le Mars, IA 51031", "+1 202-456-1111","43", "4"));
        listRepublicans.add(new Republican("Eric Cartman","Southpark", "+43 664501324","8", "1200"));
        listRepublicans.add(new Republican("DeezNuts","1126 Washington Street, Corpus Christi, TX 78476 ", "+33 4235445","18", "1300000"));
        listRepublicans.add(new Republican("Daisy Trump","1600 Pennsylvania Ave NW, Washington, DC 20500, USA", "+1 202-456-1111","70", "3400000"));



        myAdapter = new CustomAdapter (this, listRepublicans);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Republican selectedRepublican = listRepublicans.get(i);

        Intent intent = new Intent(view.getContext(),ShowRepublicanActivity.class);
        intent.putExtra("user",selectedRepublican);
        startActivity(intent);

    }



}
