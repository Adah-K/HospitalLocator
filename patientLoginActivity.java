package com.example.myhospitallocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class patientLoginActivity extends AppCompatActivity
{
    private Button patientLoginButton;
    private TextView patientRegisterLink;
    private TextView patientStatus;
    private EditText patientEmail;
    private EditText patientPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);

        patientLoginButton = (Button) findViewById(R.id.patientLogin);
        patientRegisterLink = (TextView) findViewById(R.id.patientRegisterLink);
        patientStatus = (TextView) findViewById(R.id.patientStatus);
        patientPassword = (EditText) findViewById(R.id.patient_password);
        patientEmail = (EditText) findViewById(R.id.patient_email);


        patientRegisterLink.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent registerIntent = new Intent(patientLoginActivity.this, registerActivity.class);
                startActivity(registerIntent);
            }
        });
        patientLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(patientLoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                Intent mapIntent = new Intent (patientLoginActivity.this, mapActivity.class);
                startActivity(mapIntent);
            }
        });
    }
}
