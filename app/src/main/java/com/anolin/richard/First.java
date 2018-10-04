package com.anolin.richard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraintlayout);
        Intent i = new Intent(this, AnolinRichardExam1.class);
        this.startService(i);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.next){
            i = new Intent(this, Second.class);
            startActivity(i);
        } else if (v.getId() == R.id.map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610057,120.9897273"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}
