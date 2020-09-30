package com.example.mylogindemoversion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username_text, password_text;
    Button login_button;
    TextView register_textview;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);
        username_text = (EditText) findViewById(R.id.edittext_usernameid);
        password_text = (EditText) findViewById(R.id.edittextpasswordid);
        login_button = (Button) findViewById(R.id.button_loginid);
        register_textview = (TextView) findViewById(R.id.textview_registerid);

        register_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerintent);
            }
        });
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          String user=username_text.getText().toString().trim();
          String pwd=password_text.getText().toString().trim();
          Boolean res=databaseHelper.checkUser(user,pwd);

          if(res==true)
          {
        Intent loginIntent=new Intent(MainActivity.this,HomeActivity.class);
        startActivity(loginIntent);
          }
          else{
              Toast.makeText(MainActivity.this,"Login Error",Toast.LENGTH_LONG).show();

          }

            }
        });

    }
}