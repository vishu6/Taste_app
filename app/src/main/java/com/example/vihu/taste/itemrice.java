package com.example.vihu.taste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;

public class itemrice extends AppCompatActivity {

    LinearLayout l,p,main_layout,vegp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemrice);
        l=findViewById(R.id.layout_one);
        p=findViewById(R.id.layout_plainRice);
        vegp=findViewById(R.id.layout_vegpulav);
        main_layout=findViewById(R.id.linearl);

    }

    public void plrice(View view) {
        l.setVisibility(View.GONE);
        p.setVisibility(View.VISIBLE);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

    public void vegpulav(View view) {
        l.setVisibility(View.GONE);
        vegp.setVisibility(View.VISIBLE);
    }
}
