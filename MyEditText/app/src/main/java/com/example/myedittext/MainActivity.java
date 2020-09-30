package com.example.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private EditText editText1,editText2;
   private Button addbutton,subbutton;
   TextView resulttextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.edittext1id);
        editText2=(EditText)findViewById(R.id.edittext2id);
        addbutton=(Button)findViewById(R.id.addbuttonid);
        subbutton=(Button)findViewById(R.id.subbuttonid);
        resulttextview=(TextView)findViewById(R.id.resulttextid);

      addbutton.setOnClickListener(this);
      subbutton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        try {
            String number1=  editText1.getText().toString();
            String number2=  editText2.getText().toString();


//converting number
            double num1=Double.parseDouble(number1);
            double num2=Double.parseDouble(number2);

            if(v.getId()==R.id.addbuttonid){
                double sum=num1+num2;
                resulttextview.setText("Result : "+sum);

            }

            if(v.getId()==R.id.subbuttonid){
                double sub=num1-num2;
                resulttextview.setText("Result : "+sub);

            }



        }

        catch (Exception e){
            Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();

        }




    }
}