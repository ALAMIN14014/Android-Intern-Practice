package com.example.loginoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

            Log.d("tag","Login button is clicked");
        }

        if(v.getId()==R.id.logoutbuttonid){

            Log.d("tag","Logout button is clicked");
        }

    }




}