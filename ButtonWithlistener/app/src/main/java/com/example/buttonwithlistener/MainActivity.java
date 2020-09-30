package com.example.buttonwithlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button loginbutton,logoutbutton;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textview=(TextView) findViewById(R.id.textviewid);
        loginbutton=(Button) findViewById(R.id.loginbuttonid);
        logoutbutton=(Button) findViewById(R.id.logoutbuttonid);

        loginbutton.setOnClickListener(this);
        logoutbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
   if(v.getId()==R.id.loginbuttonid){
       textview.setText("Login Button is clicked");

   }
        if(v.getId()==R.id.logoutbuttonid) {

            textview.setText("logout Button is clicked");

        }
        }
}