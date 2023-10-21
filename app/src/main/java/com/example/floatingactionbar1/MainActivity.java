package com.example.floatingactionbar1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton myFabAdd,myFabStar,myFabSmile;
    TextView starTxt,smileTxt;
    boolean isFabVisible;
    Button intentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFabAdd = findViewById(R.id.floatingBtnParent);
        myFabStar = findViewById(R.id.floatingButton1);
        myFabSmile = findViewById(R.id.floatingButton2);

        starTxt = findViewById(R.id.floatingBtnTxt1);
        smileTxt = findViewById(R.id.floatingBtnTxt2);

        intentBtn = findViewById(R.id.intentBtn);

        myFabStar.hide();
        myFabSmile.hide();
        smileTxt.setVisibility(View.GONE);
        starTxt.setVisibility(View.GONE);


        isFabVisible = false;

        myFabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.e("TAG", "onClick: outside "+ isFabVisible );
                if(!isFabVisible)
                {
                    Log.e("TAG", "onClick: if "+ isFabVisible );
                    myFabStar.show();
                    myFabSmile.show();
                    smileTxt.setVisibility(View.VISIBLE);
                    starTxt.setVisibility(View.VISIBLE);

                    isFabVisible = true;
                    Log.e("TAG", "onClick: if 1 "+ isFabVisible );
                }
                else {

                    Log.e("TAG", "onClick: else "+ isFabVisible );
                    myFabStar.hide();
                    myFabSmile.hide();
                    smileTxt.setVisibility(View.GONE);
                    starTxt.setVisibility(View.GONE);

                    isFabVisible = false;
                    Log.e("TAG", "onClick: else 1 "+ isFabVisible );
                }

            }
        });

        myFabStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Starrr",Toast.LENGTH_SHORT).show();
            }
        });

        myFabSmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Smilee",Toast.LENGTH_SHORT).show();
            }
        });

        intentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FloatingBtnActivity.class);
                startActivity(intent);
            }
        });

    }
}