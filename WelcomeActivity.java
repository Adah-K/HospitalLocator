package com.example.myhospitallocator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button patientButton;
    private Button hospitalButton;
    private Button ambulanceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        patientButton = (Button) findViewById(R.id.patient);
        hospitalButton = (Button) findViewById(R.id.hospital);
       ambulanceButton = (Button) findViewById(R.id.ambulance);

       patientButton.setOnClickListener(new View.OnClickListener()
        {
           @Override
           public void onClick(View view)
            {
                Intent patientLoginIntent = new Intent(WelcomeActivity.this, patientLoginActivity.class);
                startActivity(patientLoginIntent);
            }
        });

        hospitalButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent hospitalLoginIntent = new Intent(WelcomeActivity.this, hospitalLoginActivity.class);
                startActivity(hospitalLoginIntent);
            }
        });

        ambulanceButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ambulanceLoginIntent = new Intent(WelcomeActivity.this, ambulanceLoginActivity.class);
                startActivity(ambulanceLoginIntent);
            }
        });
    }
}
