package com.example.eladm96.alutofekhackathon_facerecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the UI buttons
        Button learn_btn = (Button) findViewById(R.id.learn_button);
        Button quiz_btn = (Button) findViewById(R.id.quiz_button);
        Button exercise_btn = (Button) findViewById(R.id.exercise_button);

        //click listener for the LEARN button
        learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LearnActivity.class);
                MainActivity.this.startActivity(intent);

            }
        });

        //click listener for the QUIZ button
        quiz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                MainActivity.this.startActivity(intent);

            }
        });

        //click listener for the EXERCISE button
        exercise_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
                MainActivity.this.startActivity(intent);

            }
        });


    }
}
