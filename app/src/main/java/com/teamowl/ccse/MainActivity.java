package com.teamowl.ccse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_EVENTS = "com.teamowl.ccse.EVENTS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ccseEvents(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ItemListActivity.class);

        startActivity(intent);

    }

}
