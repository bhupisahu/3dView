package com.bhupi.a3dview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView myview;
    RelativeLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myview=findViewById(R.id.myview);
        ll=findViewById(R.id.ll);

        myview.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        myview.setElevation(25);
                        myview.setTranslationZ(0);
                        myview.setBackgroundResource(R.drawable.pressed);
                        myview.setTextColor(getResources().getColor(R.color.colorSkinAlpha));
                        return true;
                    }
                    case MotionEvent.ACTION_UP:
                    {
                        myview.setElevation(25);
                        myview.setTranslationZ(25);
                        myview.setBackgroundResource(R.drawable.un_pressed);
                        myview.setTextColor(getResources().getColor(R.color.colorSkin));

                    }
                }


                return false;
            }

        });
    }
}