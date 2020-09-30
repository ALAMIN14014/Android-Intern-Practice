package com.example.mydatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private DatePicker datePicker;
     private Button selectbutton;
     private TextView resultview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectbutton=(Button) findViewById(R.id.buttonid);
        resultview=(TextView)findViewById(R.id.resultviewid);
        datePicker=(DatePicker)findViewById(R.id.datepickerid);
         resultview.setText(currentDate());


         selectbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                  resultview.setText(currentDate());

             }
         });

    }

    String currentDate(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Current Date : ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());

      return   stringBuilder.toString();

    }

}