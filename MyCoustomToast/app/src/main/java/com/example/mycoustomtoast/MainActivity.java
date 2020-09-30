package com.example.mycoustomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton=(Button)findViewById(R.id.loginbuttonid);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=getLayoutInflater();
           View customView= inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.customtoast_id));
                Toast toast=new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(customView);
                toast.show();

            }
        });
    }
}