package com.labra.mytodotehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button teeTehdyksi = findViewById(R.id.tehtyNappi);
        Button palaa = findViewById(R.id.palaaButton);
        TextView otsikkoView = findViewById(R.id.otsikkoTeksti);
        TextView descView = findViewById(R.id.descTeksti);


        Bundle bundle = getIntent().getExtras();

        otsikkoView.setText(bundle.getString("otsikkoTeksti"));
        descView.setText(bundle.getString("descTeksti"));

        final String childId = (bundle.getString("idTeksti"));


        teeTehdyksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference tehtavaPaivitus = FirebaseDatabase.getInstance().getReference().child("tehtavat").child(childId);
                tehtavaPaivitus.child("onkoTehty").setValue("On tehty");
            }
        });






        palaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
