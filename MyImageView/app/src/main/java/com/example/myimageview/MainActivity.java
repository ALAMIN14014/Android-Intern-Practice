package com.example.myimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imageView1=(ImageView) findViewById(R.id.imageviewid1);
    imageView2=(ImageView) findViewById(R.id.imageviewid2);

        imageView1.setOnClickListener(this);

        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    if(v.getId()==R.id.imageviewid1)
    {

        Toast.makeText(MainActivity.this,"Village Farmer Scene",Toast.LENGTH_SHORT).show();
    }


        if(v.getId()==R.id.imageviewid2)
        {

            Toast.makeText(MainActivity.this,"Village Evening Scene",Toast.LENGTH_SHORT).show();
        }
    }


}