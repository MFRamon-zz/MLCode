package com.example.qrml.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.qrml.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private TextInputEditText _txtEditUsername,_txtEditPassword;
    private TextInputLayout _txtLayoutUsername,_txtLayoutPassword;
    private MaterialButton _btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initializeComponents();
        findViewById(R.id.btnLogin).setOnClickListener(this);

    }

    public void initializeComponents(){
        _txtLayoutUsername = findViewById(R.id.txtUser);
        _txtLayoutPassword = findViewById(R.id.txtPassword);
        _btnLogin = findViewById(R.id.btnLogin);
    }

    public void getCredentials(){
        String userEmail = _txtLayoutUsername.getEditText().getText().toString();
        String userPassword = _txtLayoutPassword.getEditText().getText().toString();
    }

    public void validateCredentials(String userEmail, String userPassword){

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                getCredentials();
                Intent intent = new Intent(getApplicationContext(),ScanActivity.class);
                startActivity(intent);
                break;
        }
    }
}
