package com.example.smgue.floatinglabel;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextInputLayout mFullnameEditText, mEmailEditText, mPasswordEditText;
    EditText mFullname, mEmail, mPassword;

    Button mButtonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFullnameEditText = findViewById(R.id.textInputLayoutFullname);
        mEmailEditText = findViewById(R.id.textInputLayoutEmail);
        mPasswordEditText = findViewById(R.id.textInputLayoutPassword);

        mFullname = findViewById(R.id.fullnameField);
        mEmail = findViewById(R.id.emailField);
        mPassword = findViewById(R.id.passwordField);

        mButtonSignUp = findViewById(R.id.btnSignUp);

    }

    public void signUp(View view){
        boolean isValid = true;

        if(mFullname.getText().toString().isEmpty()){
            mFullnameEditText.setError("Full Name is Mandatory");
            isValid = false;
        }else{
            mFullnameEditText.setErrorEnabled(false);
        }
        if(mEmail.getText().toString().isEmpty()){
            mEmailEditText.setError("Email is Mandatory");
            isValid = false;
        }else{
            mEmailEditText.setErrorEnabled(false);
        }
        if(mPassword.getText().toString().isEmpty()){
            mPasswordEditText.setError("Password is Mandatory");
            isValid = false;
        }else{
            mPasswordEditText.setErrorEnabled(false);
        }

        if(isValid){
            Toast.makeText(MainActivity.this, R.string.welcome, Toast.LENGTH_LONG).show();
        }
    }
}
