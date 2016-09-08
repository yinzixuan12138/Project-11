package com.example.yinzixuan.project_11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Name=(EditText)findViewById(R.id.editText2);
        final EditText Number=(EditText)findViewById(R.id.editText);

        Button button=(Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                int number=0;
                String Name_string=Name.getText().toString();
                String Number_string=Number.getText().toString();
                number=Integer.parseInt(Number_string);
                intent.putExtra("name",Name_string);
                intent.putExtra("number",number);
                startActivityForResult(intent,0);
            }
        });


    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode, data);
        TextView Student_1=(TextView)findViewById(R.id.Student_1);
        TextView Student_2=(TextView)findViewById(R.id.Student_2);
        TextView Student_3=(TextView)findViewById(R.id.Student_3);
        TextView textView=(TextView)findViewById(R.id.textView);

        if (requestCode == 0 &&resultCode == 0) {
            String str = data.getStringExtra("result");
            if(a==0){

                Student_1.setText(str+"");
            }
            if(a==1){

                Student_2.setText(str+"");
            }
            if(a==2){

                Student_3.setText(str+"");
            }
            if(a>3)textView.setText("显示已满！！！");
            a++;
        }
    }
}

