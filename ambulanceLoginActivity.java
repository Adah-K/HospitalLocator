package com.example.myhospitallocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ambulanceLoginActivity extends AppCompatActivity
{
    private Button ambulanceLoginButton;
    private TextView ambulanceRegisterLink;
    private TextView ambulanceStatus;
    private EditText ambulanceEmail;
    private EditText ambulancePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ambulance_login);

        ambulanceLoginButton = (Button) findViewById(R.id.ambulanceLogin);
        ambulanceRegisterLink = (TextView) findViewById(R.id.ambulanceRegisterLink);
        ambulanceStatus = (TextView) findViewById(R.id.ambulanceStatus);
        ambulancePassword = (EditText) findViewById(R.id.ambulance_password);
        ambulanceEmail = (EditText) findViewById(R.id.ambulance_email);

        ambulanceRegisterLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent registerIntent = new Intent(ambulanceLoginActivity.this, registerActivity.class);
                startActivity(registerIntent);
            }
        });

        ambulanceLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });
    }
}
