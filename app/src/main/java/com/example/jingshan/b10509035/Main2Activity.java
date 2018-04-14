package com.example.jingshan.b10509035;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = this.getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("B10509035:"+bundle.getString("show"));

    }

}
