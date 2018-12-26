package com.example.srivathsan.floatinglabel;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fullName, email, password;
    TextInputLayout fullNameInputLayout, emailInputLayout, passwordInputLayout;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullName = (EditText)findViewById(R.id.fullnameField);
        email = (EditText)findViewById(R.id.emailField);
        password = (EditText)findViewById(R.id.passwordField);

        fullNameInputLayout = (TextInputLayout) findViewById(R.id.inputLayoutFullName);
        emailInputLayout = (TextInputLayout)findViewById(R.id.inputLayoutEmail);
        passwordInputLayout = (TextInputLayout)findViewById(R.id.inputLayoutPassword);

        button = (Button)findViewById(R.id.signUpBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isValid=true;
                if(fullName.getText().toString().isEmpty()){
                    fullNameInputLayout.setError("Mandatoy field");isValid=false;
                }
                else{

                    fullNameInputLayout.setErrorEnabled(false);
                }
                if(email.getText().toString().isEmpty()){
                    emailInputLayout.setError("Mandatoy field");isValid=false;
                }
                else{
                    emailInputLayout.setErrorEnabled(false);
                }
                if(password.getText().toString().isEmpty()){
                    passwordInputLayout.setError("Mandatoy field");isValid=false;
                }
                else if(password.getText().length()<8){isValid=false;passwordInputLayout.setError("Minimum 8 characters required");}
                else passwordInputLayout.setErrorEnabled(false);

                if(isValid){
                    Toast.makeText(MainActivity.this, "User signed up", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
