package com.example.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radiogroup;
    private Button showbutton;
    private RadioButton genderbutton;
    private TextView resultview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    radiogroup=(RadioGroup) findViewById(R.id.radiogroupid);
    showbutton=(Button)findViewById(R.id.buttonid);
    resultview=(TextView)findViewById(R.id.resultviewid);

    showbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int selected=radiogroup.getCheckedRadioButtonId();//radio button er id find korse
            genderbutton=(RadioButton)findViewById(selected);// id help niye radio button ta find korse
          String value= genderbutton.getText().toString();
            resultview.setText("You have selected : "+value);

        }
    });


    }
}