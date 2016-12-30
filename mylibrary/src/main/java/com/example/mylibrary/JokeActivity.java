package com.example.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTV = (TextView) findViewById(R.id.jokeTextView);

        Intent intent = getIntent();
        String jokeText = intent.getExtras().getString("jokeText");

        jokeTV.setText(jokeText);
    }
}
