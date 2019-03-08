package com.vamsi.malneedi.sharedpreferences;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends Activity {

    private static final String MY_PREFERENCE = "My Data";
    private TextView Text1;
    private TextView Text2;
    private TextView Text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences preferences = getSharedPreferences(MY_PREFERENCE, Context.MODE_PRIVATE);
        String name = (preferences.getString("Name Key", ""));
        String Number = (preferences.getString("Number Key", ""));
        String Email = (preferences.getString("Email Key", ""));
        Text1 = (TextView) findViewById(R.id.Text);
        Text2 = (TextView) findViewById(R.id.Text2);
        Text3 = (TextView) findViewById(R.id.Text1);
        Text1.setText(name);
        Text2.setText(Number);
        Text3.setText(Email);
    }
}
