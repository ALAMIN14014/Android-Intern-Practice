package com.example.mycheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkcheckbox,sugarcheckbox, watercheckbox;
    private Button showbutton;
    private TextView resulttextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkcheckbox=(CheckBox) findViewById(R.id.milkcheckboxid);
        sugarcheckbox=(CheckBox) findViewById(R.id.sugarcheckboxid);
        watercheckbox=(CheckBox) findViewById(R.id.watercheckboxid);

        showbutton=(Button) findViewById(R.id.showbuttonid);
        resulttextview=(TextView)findViewById(R.id.resultviewid);

        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringbuilder=new StringBuilder();

                if(milkcheckbox.isChecked()){

                    String value=milkcheckbox.getText().toString();
                    stringbuilder.append(value+" is ordered\n");

                }
                if(sugarcheckbox.isChecked()){

                    String value=sugarcheckbox.getText().toString();
                    stringbuilder.append(value+" is ordered\n");

                }

                if(watercheckbox.isChecked()){

                    String value=watercheckbox.getText().toString();
                    stringbuilder.append(value+" is ordered\n");

                }
        resulttextview.setText(stringbuilder);



            }
        });


    }
}