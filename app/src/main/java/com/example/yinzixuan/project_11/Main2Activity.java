package com.example.yinzixuan.project_11;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button Return=(Button)findViewById(R.id.Return);
        final TextView Name=(TextView)findViewById(R.id.Name);
        final TextView Number=(TextView)findViewById(R.id.Number);
        final Intent intent=getIntent();
        final String name_string=intent.getStringExtra("name");
        final Integer number_string=intent.getIntExtra("number",0);
        Name.setText("姓名："+name_string);
        Number.setText("学号："+number_string);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("result","姓名："+name_string+"学号："+number_string);
                setResult(0,intent);
                finish();

            }
        });

    }

}
