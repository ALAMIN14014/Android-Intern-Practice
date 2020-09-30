package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  // private TextView nametextview;
  int count =0;
  private TextView textview;
  private  Button loginbutton,logoutbutton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      nametextview=(TextView)findViewById(R.id.NameTextViewId);
  //      nametextview.setText("AL Amin");

//login button with listener
      loginbutton= (Button)findViewById(R.id.loginbuttonid);
        logoutbutton= (Button)findViewById(R.id.logoutbuttonid);

        textview=(TextView)findViewById(R.id.textviewid);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textview.setText("Login Button is clicked ");
            }
        });

        logoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textview.setText("Logout Button is clicked ");
            }
        });


//end
    }
}