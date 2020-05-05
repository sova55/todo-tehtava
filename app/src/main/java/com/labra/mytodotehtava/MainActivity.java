package com.labra.mytodotehtava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity  {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] myDataset = {
            "Yksi",
            "Kaksi",
            "Kolme",
            "neljä",
            "viisi"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }

   // @Override
  //  public void onNoteClick(int position) {
  //      Intent intent = new Intent(this, );
   //     startActivity(intent);
  //  }
}
