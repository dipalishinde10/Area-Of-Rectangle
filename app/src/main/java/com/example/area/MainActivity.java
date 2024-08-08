package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText l=(EditText) findViewById(R.id.length);
        EditText b=(EditText) findViewById(R.id.breadth);
        TextView t1=(TextView) findViewById(R.id.textView1);
        TextView t2=(TextView) findViewById(R.id.textView2);
        TextView Result=(TextView) findViewById(R.id.textView3);
        Button B1=(Button) findViewById(R.id.btn);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int len=Integer.parseInt(l.getText().toString().trim());
                int bre=Integer.parseInt(b.getText().toString().trim());
                int res=len*bre;
                Result.setText("area of Rectangle::"+res);
                Toast.makeText(MainActivity.this,"area of rectangle is"+res,Toast.LENGTH_SHORT).show();

            }
        });





    }
}