package com.example.rafii_amd.aplikasipendaftaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class form_pendaftaran extends AppCompatActivity {
    //Todo Global variabel
    int jumlah = 0;
    TextView score;
    Button goal, resetscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pendaftaran);

        //Todo relasi variabel class dengan variabel ID XML Layout
        score = (TextView)findViewById(R.id.score);
        goal = (Button)findViewById(R.id.goal);
        resetscore = (Button)findViewById(R.id.resetscore);

        //Todo fungsi click
        resetscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah = 0;
                score.setText(""+jumlah);
            }
        });
        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jumlah = jumlah + 1;
                score.setText(""+jumlah);
            }
        });

    }
}
