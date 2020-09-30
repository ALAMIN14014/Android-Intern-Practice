package com.example.mytimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    timePicker=(TimePicker)findViewById(R.id.timepickerid);
    timePicker.setIs24HourView(true);//for 24 hours
    textView=(TextView)findViewById(R.id.textviewid);
    button=(Button)findViewById(R.id.buttonid);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String value=timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();

        textView.setText(value);
        }
    });

    }
}