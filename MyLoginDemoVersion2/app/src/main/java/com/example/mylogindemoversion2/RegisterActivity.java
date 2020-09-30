package com.example.mylogindemoversion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText username_text, password_text, password_cnf_text;
    Button register_button;
    TextView login_textview;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username_text = (EditText) findViewById(R.id.edittext_usernameid);
        password_text = (EditText) findViewById(R.id.edittextpasswordid);
        password_cnf_text = (EditText) findViewById(R.id.edittext_cnfpasswordid);
        register_button = (Button) findViewById(R.id.button_registerid);
        login_textview = (TextView) findViewById(R.id.textview_loginid);
        databaseHelper = new DatabaseHelper(this);

        login_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username_text.getText().toString().trim();
                String pwd = password_text.getText().toString().trim();
                String cnf_pwd = password_cnf_text.getText().toString().trim();
                if (pwd.equals(cnf_pwd)) {
                    long value = databaseHelper.adduser(user, pwd);
                    if (value > 0) {
                        Toast.makeText(RegisterActivity.this, "You have registered Successfually ", Toast.LENGTH_LONG).show();
                        Intent MovetoLogin = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(MovetoLogin);

                    } else {
                        Toast.makeText(RegisterActivity.this, "Registration error ", Toast.LENGTH_LONG).show();

                    }
                } else {

                    Toast.makeText(RegisterActivity.this, "Password is not matching", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}