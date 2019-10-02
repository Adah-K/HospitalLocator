package com.example.myhospitallocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class hospitalLoginActivity extends AppCompatActivity
{
    private Button hospitalLoginButton;
    private TextView hospitalRegisterLink;
    private TextView hospitalStatus;
    private EditText hospitalEmail;
    private EditText hospitalPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_login);

        hospitalLoginButton = (Button) findViewById(R.id.hospitalLogin);
        hospitalRegisterLink = (TextView) findViewById(R.id.hospitalRegisterLink);
        hospitalStatus = (TextView) findViewById(R.id.hospitalStatus);
        hospitalPassword = (EditText) findViewById(R.id.hospital_password);
        hospitalEmail = (EditText) findViewById(R.id.hospital_email);

        hospitalRegisterLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent registerIntent = new Intent(hospitalLoginActivity.this, registerActivity.class);
                startActivity(registerIntent);
            }
        });
        hospitalLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(hospitalLoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                Intent mapIntent = new Intent (hospitalLoginActivity.this, MapsActivity.class);
                startActivity(mapIntent);
            }
        });
    }
}
