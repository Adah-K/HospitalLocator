package com.example.myhospitallocator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registerActivity extends AppCompatActivity
{
    EditText email, pword;
    Button signup;

    FirebaseAuth fbAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fbAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.registerEmail);
        pword = findViewById(R.id.registerPassword);
        signup = findViewById(R.id.registerButton);

        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String e_mail = email.getText().toString();
                String p_word = pword.getText().toString();

                if(e_mail.isEmpty())
                {
                    email.setError("Fill in email field");
                    email.requestFocus();
                }
                else if(p_word.isEmpty())
                {
                    pword.setError("Password field is empty");
                    pword.requestFocus();
                }
                else if(p_word.isEmpty() && e_mail.isEmpty())
                {
                    Toast.makeText(registerActivity.this, "Fields are empty!!", Toast.LENGTH_SHORT).show();
                }
                else if (!(p_word.isEmpty() && e_mail.isEmpty()))
                {
                    fbAuth.createUserWithEmailAndPassword(e_mail, p_word).addOnCompleteListener(registerActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful())
                            {
                                Toast.makeText(registerActivity.this, "Sign up Successful", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(registerActivity.this, "Sign up Unsuccessful", Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }
                else {
                    Toast.makeText(registerActivity.this, "An error occurred, Please try again in a few moments", Toast.LENGTH_LONG).show();
                }

                Intent mapIntent = new Intent (registerActivity.this, mapActivity.class);
                startActivity(mapIntent);
                Toast.makeText(registerActivity.this, "Welcome...", Toast.LENGTH_LONG).show();

            }
        });
    }
}
