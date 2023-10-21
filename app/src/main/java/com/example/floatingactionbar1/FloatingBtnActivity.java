package com.example.floatingactionbar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class FloatingBtnActivity extends AppCompatActivity {

    RelativeLayout Layout;
    ExtendedFloatingActionButton FloatBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_btn);

        Layout= findViewById(R.id.Layout);
        FloatBtn = findViewById(R.id.FLoatingActionBtnBig);

        FloatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(Layout,"This is a snack bar", Snackbar.LENGTH_SHORT).setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast
                                .makeText(
                                        FloatingBtnActivity.this,
                                        "Undo Clicked",
                                        Toast.LENGTH_SHORT)
                                .show();
                    }
                });

                snackbar.show();
            }
        });
    }
}