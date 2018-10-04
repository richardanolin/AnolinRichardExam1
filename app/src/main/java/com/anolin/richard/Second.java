package com.anolin.richard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Intent i = new Intent(this, AnolinRichardExam1.class);
        this.startService(i);
    }
    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.prev){
            i = new Intent(this, First.class);
            startActivity(i);
        }
    }
}{
}
