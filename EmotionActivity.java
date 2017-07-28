package com.example.eladm96.alutofekhackathon_facerecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.zip.Inflater;

import static android.graphics.Color.GREEN;

public class EmotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion);

        final Button happy_btn = (Button) findViewById(R.id.happy_button);

        //click listener for the LEARN button
        happy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                happy_btn.setBackgroundColor(GREEN);
                Intent intent = new Intent(EmotionActivity.this, MainActivity.class);
                EmotionActivity.this.startActivity(intent);

            }
        });
    }
}
