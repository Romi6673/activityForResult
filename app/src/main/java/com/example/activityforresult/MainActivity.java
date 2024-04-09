package com.example.activityforresult;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static Random rnd=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        watchResult = findViewById(R.id.watchResult);
        enterRandom = findViewById(R.id.enterRandom);
    }
    EditText a;
    EditText b;
    EditText c;

    Button watchResult;
    Button enterRandom;


    //        String STa= a.getText().toString();
    //        int aNum=Integer.parseInt(STa);
    public void randomNums(View view) {
        int aNum=rnd.nextInt(10);
        int bNum=rnd.nextInt(10);
        int cNum=rnd.nextInt(10);
        Intent si = new Intent(this,secodActivity.class);
        si.putExtra("aNum",aNum);
        si.putExtra("bNum",bNum);
        si.putExtra("cNum",cNum);
        startActivity(si);
    }
    public void go(View view) {
        String STa= a.getText().toString();
        int aNum=Integer.parseInt(STa);
        String STb= b.getText().toString();
        int bNum=Integer.parseInt(STb);
        String STc= c.getText().toString();
        int cNum=Integer.parseInt(STc);
        Intent si = new Intent(this,secodActivity.class);

        si.putExtra("aNum",aNum);
        si.putExtra("bNum",bNum);
        si.putExtra("cNum",cNum);
        startActivity(si);
    }

}