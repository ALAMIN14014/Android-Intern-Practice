package com.example.myzoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    private  ZoomControls zoomControls;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    zoomControls =(ZoomControls) findViewById(R.id.zoomcontrolid);
    imageView=(ImageView)findViewById(R.id.imageviewid);

    zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            float x=imageView.getScaleX();
            float y=imageView.getScaleY();
            imageView.setScaleX((float)x+1);
            imageView.setScaleY((float)y+1);

            Toast.makeText(MainActivity.this,"Zoom in",Toast.LENGTH_SHORT).show();


        }
    });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x=imageView.getScaleX();
                float y=imageView.getScaleY();
                if(x>1&&y>1) {
                    imageView.setScaleX((float) x - 1);
                    imageView.setScaleY((float) y - 1);
                }
                Toast.makeText(MainActivity.this,"Zoom out",Toast.LENGTH_SHORT).show();


            }
        });


    }
}