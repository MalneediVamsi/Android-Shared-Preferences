package com.vamsi.malneedi.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    private static final String MY_PREFERENCE = "My Data";
    private static final String NAMEKEY = "Name Key";
    private static final String NUMBERKEY = "Number Key";
    private static final String EMAIL = "Email Key";
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        Button button = (Button) findViewById(R.id.button);

        sharedPreferences = getSharedPreferences(MY_PREFERENCE, MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText1.getText().toString();
                String Number = editText2.getText().toString();
                String email = editText3.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(NAMEKEY, name);
                editor.putString(NUMBERKEY, Number);
                editor.putString(EMAIL, email);
                editor.apply();
                Toast.makeText(MainActivity1.this, "Thanks", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
