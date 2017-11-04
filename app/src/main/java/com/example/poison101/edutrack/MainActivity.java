package com.example.poison101.edutrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //button for logging in
    Button btn_login,btn_signup;

    //Intent
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Casting();
        setOnClick();
    }

    //Casting
    public void Casting() {
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_signup = (Button) findViewById(R.id.btn_signup);
    }



    //setOnClick
    public void setOnClick() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(MainActivity.this,DashBoard.class);
                startActivity(intent);
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

}
