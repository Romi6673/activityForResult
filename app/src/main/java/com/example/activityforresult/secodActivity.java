package com.example.activityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class secodActivity extends AppCompatActivity {
    Intent gi = getIntent();
    ImageView imageView;
    TextView result;
    TextView result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secod);
        result = findViewById(R.id.result);
        imageView = findViewById(R.id.imageView);

        gi = getIntent();

        int a = gi.getIntExtra("aNum", 1);
        int b = gi.getIntExtra("bNum", 1);
        int c = gi.getIntExtra("cNum", 1);
        double part = (b * b) - 4 * a * c;
        if (part < 0) {
            result.setText("no result");
        } else {
            double x1 = (-b + (Math.sqrt(part))) / (2 * a);
            double x2 = (-b - (Math.sqrt(part))) / (2 * a);
            result.setText("  x1= " + x1 +" |  x2= " + x2);
        }
        if (a<0 && c<0){
            imageView.setImageResource(R.drawable.upsidown_no_x);
        }else if(a>0 && c==0){
            imageView.setImageResource(R.drawable.one_x_);
        }else if (a>0 && c<0){
            imageView.setImageResource(R.drawable.two_x_split);
        }else if (a<0 && c==0){
            imageView.setImageResource(R.drawable.upsidown_onex_);
        }else if (a>0 && c>0){
            imageView.setImageResource(R.drawable.no_x);
        }else if(a<0 && c>0){
            imageView.setImageResource(R.drawable.upsidown_two_x);
        }
    }

}

