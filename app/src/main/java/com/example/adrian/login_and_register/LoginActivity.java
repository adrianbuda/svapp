package com.example.adrian.login_and_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jgabrielfreitas.core.BlurImageView;


public class LoginActivity extends AppCompatActivity {

    TextView signUpButton;
    BlurImageView background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    signUpButton = findViewById(R.id.signUp);

    background = findViewById(R.id.myBackground);
    background.setBlur(3);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }



}
