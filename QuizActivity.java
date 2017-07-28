package com.example.eladm96.alutofekhackathon_facerecognition;

import android.app.Dialog;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class QuizActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;

    QuizActivity t;

    int choose_number;
    float tgtWidth;
    int success;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //setting the images view
        img1 = (ImageView)findViewById(R.id.imageView1);
        img2 = (ImageView)findViewById(R.id.imageView2);
        img3 = (ImageView)findViewById(R.id.imageView3);
        img4 = (ImageView)findViewById(R.id.imageView4);

        t = this;

        success = 0;
        choose_number = 0;
        //setting the target layout
        LinearLayout tgt_layout = (LinearLayout)findViewById(R.id.src_layout);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        tgtWidth = displayMetrics.widthPixels;


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAnimation animation = new TranslateAnimation(
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, (tgtWidth/4) * choose_number - (tgtWidth/4) * 1,
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, 400);
                animation.setDuration(1000);
                animation.setFillAfter(true);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        if (choose_number == 4)
                        {
                            Dialog dlg = new Dialog(t);
                            dlg.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                            dlg.setContentView(getLayoutInflater().inflate(R.layout.fail_dialog, null));
                            dlg.show();
                        }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                if (choose_number == 0)
                    success++;
                img1.startAnimation(animation);
                choose_number++;
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAnimation animation = new TranslateAnimation(
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, (tgtWidth/4) * choose_number - (tgtWidth/4) * 0,
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, 400);
                animation.setDuration(1000);
                animation.setFillAfter(true);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        if (choose_number == 4)
                        {
                            Dialog dlg = new Dialog(t);
                            dlg.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                            dlg.setContentView(getLayoutInflater().inflate(R.layout.fail_dialog, null));
                            dlg.show();
                        }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                if (choose_number == 1)
                    success++;
                img2.startAnimation(animation);
                choose_number++;
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAnimation animation = new TranslateAnimation(
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, (tgtWidth/4) * choose_number - (tgtWidth/4) * 3,
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, 400);
                animation.setDuration(1000);
                animation.setFillAfter(true);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        if (choose_number == 4)
                        {
                            Dialog dlg = new Dialog(t);
                            dlg.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                            dlg.setContentView(getLayoutInflater().inflate(R.layout.fail_dialog, null));
                            dlg.show();
                        }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                if (choose_number == 2)
                    success++;
                img3.startAnimation(animation);
                choose_number++;
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                TranslateAnimation animation = new TranslateAnimation(
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, (tgtWidth/4) * choose_number - (tgtWidth/4) * 2,
                        Animation.RELATIVE_TO_SELF, 0,
                        Animation.ABSOLUTE, 400);
                animation.setDuration(1000);
                animation.setFillAfter(true);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        if (choose_number == 4)
                            if (success == 4)
                            {
                                Dialog dlg = new Dialog(t);
                                dlg.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                                dlg.setContentView(getLayoutInflater().inflate(R.layout.success_dialog, null));
                                dlg.show();
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        findViewById(android.R.id.content).invalidate();
                                        setContentView(R.layout.activity_quiz);

                                    }
                                });
                            }
                            else
                            {
                                Dialog dlg = new Dialog(t);
                                dlg.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                                dlg.setContentView(getLayoutInflater().inflate(R.layout.fail_dialog, null));
                                dlg.show();
                            }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                if (choose_number == 3)
                    success++;
                img4.startAnimation(animation);
                choose_number++;
            }
        });

    }

    }
}
