package com.example.adrian.login_and_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jgabrielfreitas.core.BlurImageView;

public class RegisterActivity extends AppCompatActivity {

    TextView existingAccount;
    BlurImageView mybackground;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mybackground=findViewById(R.id.myBackground);
        mybackground.setBlur(2);


        existingAccount = findViewById(R.id.loginRedirect);
        existingAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
