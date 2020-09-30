package com.example.mysqlitedatabasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  MyDatabaseHelper myDatabaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    myDatabaseHelper=new MyDatabaseHelper(this);
    SQLiteDatabase sqLiteDatabase =myDatabaseHelper.getWritableDatabase();

    }
}