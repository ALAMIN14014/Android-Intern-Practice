package com.example.mytimepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private TextView textView;
   private Button button;
   private TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button=(Button) findViewById(R.id.buttonid);
    textView=(TextView)findViewById(R.id.textviewid);

button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
         TimePicker timePicker =new TimePicker(this);
        int currentHour=timePicker.getCurrentHour();
        int currentmin=timePicker.getCurrentMinute();
timePickerDialog=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

  textView.setText(hourOfDay+" : "+minute);
    }
},currentHour,currentmin,true);

timePickerDialog.show();
    }
}