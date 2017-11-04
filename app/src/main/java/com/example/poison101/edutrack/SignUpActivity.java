package com.example.poison101.edutrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Button btn_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //sign up
        btn_reg = (Button) findViewById(R.id.sign_up_button);
        

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(SignUpActivity.this,MainActivity.class);
                startActivity(x);

                Toast.makeText(getApplicationContext(), "Registration Success, Please login", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
