package com.example.mysqlitedatabaseinsertingdata;


import android.app.AlertDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button addbutton, showbutton, updatebutton, deletebutton;
    private TextView nametextview, agetextview, gendertextview, idedittext;
    MyDatabaseHelper myDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabaseHelper = new MyDatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase = myDatabaseHelper.getWritableDatabase();

        nametextview = (TextView) findViewById(R.id.nameedittextid);
        agetextview = (TextView) findViewById(R.id.ageedittextid);
        gendertextview = (TextView) findViewById(R.id.genderedittextid);
        idedittext = (TextView) findViewById(R.id.idedittextid);

        addbutton = (Button) findViewById(R.id.addbuttonid);
        showbutton = (Button) findViewById(R.id.showbuttonid);
        updatebutton = (Button) findViewById(R.id.updatebuttonid);
        deletebutton = (Button) findViewById(R.id.deletebuttonid);

        addbutton.setOnClickListener(this);
        showbutton.setOnClickListener(this);
        updatebutton.setOnClickListener(this);
        deletebutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String name = nametextview.getText().toString();

        String age = agetextview.getText().toString();

        String gender = gendertextview.getText().toString();
        String id = idedittext.getText().toString();

        if (v.getId() == R.id.addbuttonid) {

            long rowId = myDatabaseHelper.InsertData(name, age, gender);
            if (rowId == -1) {
                Toast.makeText(getApplicationContext(), "Not successfully inserted ", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(getApplicationContext(), "Row " + rowId + " is successfully inserted ", Toast.LENGTH_LONG).show();

            }
        }
        if (v.getId() == R.id.showbuttonid) {

            Cursor cursor = myDatabaseHelper.DisplayAllData();
            if (cursor.getCount() == 0) {
                showData("Error", "No data found");
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (cursor.moveToNext()) {
                stringBuffer.append("ID : " + cursor.getString(0) + "\n");
                stringBuffer.append("Name : " + cursor.getString(1) + "\n");
                stringBuffer.append("Age : " + cursor.getString(2) + "\n");
                stringBuffer.append("Gender: " + cursor.getString(3) + "\n\n\n");
            }

            showData("Resultset", stringBuffer.toString());

        }
        if (v.getId() == R.id.updatebuttonid) {
            boolean isUpdated = myDatabaseHelper.upateData(id, name, age, gender);
            if (isUpdated == true) {
                Toast.makeText(getApplicationContext(), "Data is updated ", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(getApplicationContext(), "Data is not upadted ", Toast.LENGTH_LONG).show();

            }
        }

        if (v.getId() == R.id.deletebuttonid) {

            int value = myDatabaseHelper.deleteData(id);
            if (value > 0) {
                Toast.makeText(getApplicationContext(), "Data is Deleted ", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Data is not Deleted ", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void showData(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.show();
    }

}