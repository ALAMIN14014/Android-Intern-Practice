package com.example.buttonlistenerinxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton,logoutbutton;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton=(Button)findViewById(R.id.loginbuttonid);

        logoutbutton=(Button)findViewById(R.id.logoutbuttonid);

        textview=(TextView)findViewById(R.id.textviewid);





    }

    public void showMessage(View v){

  if(v.getId()==R.id.loginbuttonid){

      textview.setText("Login Button is clicked");
  }

        if(v.getId()==R.id.logoutbuttonid){

            textview.setText("Logout Button is clicked");
        }

    }

}