package com.example.myalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private Button Exitbutton;
     private AlertDialog.Builder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Exitbutton=(Button) findViewById(R.id.buttonid);

   Exitbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
alertDialog=new AlertDialog.Builder(MainActivity.this);
//title setting
alertDialog.setTitle(R.string.alert_text);
//message setting
       alertDialog.setMessage(R.string.message_text);
   //icon setting
   alertDialog.setIcon(R.drawable.question);
   alertDialog.setCancelable(false);
   alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           //exit
           finish();
       }
   });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                dialog.cancel();           }
        });
        alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //exit
                Toast.makeText(MainActivity.this,"You have clicked on calcel Button",Toast.LENGTH_SHORT).show();
            }
        });

   AlertDialog alertdialog =alertDialog.create();
   alertdialog.show();


    }
}