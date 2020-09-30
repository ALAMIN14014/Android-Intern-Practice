package com.example.toastapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton,logoutbutton;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showMessage(View v){

        if(v.getId()==R.id.loginbuttonid){

          //  Toast.makeText(MainActivity.this,"Login Button is clicked",Toast.LENGTH_LONG).show();
           //alternative way
            Toast toast=Toast.makeText(MainActivity.this,"Login Button is clicked",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();

        }

        if(v.getId()==R.id.logoutbuttonid){

            Toast.makeText(MainActivity.this,"Logout Button is clicked",Toast.LENGTH_LONG).show();
        }

    }



}