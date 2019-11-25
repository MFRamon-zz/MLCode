package com.example.qrml.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.qrml.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {


    private TextInputEditText _txtEditUsername;
    private TextInputLayout _txtLayoutUsername;

    private TextInputEditText _txtEditPassword;
    private TextInputLayout _txtLayoutPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _txtEditUsername.findViewById(R.id.txtUser);
        _txtEditPassword.findViewById(R.id.txtPassword);
    }
}
