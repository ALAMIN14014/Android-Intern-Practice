package com.example.myloginpagedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nameedittext, passwordedittext, emailedittext, usernameendittext;
    private Button signupbutton;

    UserDetails userDetails;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nameedittext = (EditText) findViewById(R.id.signupnameedittextid);

        passwordedittext = (EditText) findViewById(R.id.signuppasswordedittextid);

        emailedittext = (EditText) findViewById(R.id.signupemailedittextid);

        usernameendittext = (EditText) findViewById(R.id.signupusernameedittextid);

        signupbutton = (Button) findViewById(R.id.signupbuttonid);

        userDetails=new UserDetails();
        databaseHelper=new DatabaseHelper(this);
        signupbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String name=nameedittext.getText().toString();

        String email=emailedittext.getText().toString();

        String usrname=usernameendittext.getText().toString();

        String password=passwordedittext.getText().toString();

        userDetails.setName(name);
        userDetails.setEmail(email);
        userDetails.setPassword(password);
        userDetails.setUsername(usrname);

        long rowId=databaseHelper.insertData(userDetails);
  if(rowId>0)
  {
      Toast.makeText(getApplicationContext(),"Row "+rowId+" is successfully inserted",Toast.LENGTH_LONG).show();
  }
else{
      Toast.makeText(getApplicationContext()," Data insertion failed",Toast.LENGTH_LONG).show();
  }

    }
}