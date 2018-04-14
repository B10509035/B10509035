package com.example.jingshan.b10509035;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.text.Editable;

public class MainActivity extends AppCompatActivity {
    private EditText edt;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText)findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(Main2Activity);}

    private Button.OnClickListener Main2Activity = new Button.OnClickListener(){
        public void onClick(View v){
            EditText editText = (EditText)findViewById(R.id.editText);
            Editable Str;
            Str = editText.getText();
            String show = Str.toString();

            Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putString("show",editText.getText().toString());
            intent.putExtras(bundle);

            startActivity(intent);}
        };
}


