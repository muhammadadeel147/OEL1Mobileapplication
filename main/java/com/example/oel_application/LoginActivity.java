package com.example.oel_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the entered username and password are correct
                if (isValidCredentials(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString())) {
                    // If the credentials are valid, go to the profile activity
                    Intent intent = new Intent(LoginActivity.this, CarDetails.class);
                    startActivity(intent);
//                    Toast.makeText(LoginActivity.this, "login Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    // If the credentials are invalid, show an error message
                    Toast.makeText(LoginActivity.this, "Empty username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private boolean isValidCredentials(String username, String password) {
        return !username.equals("") && !password.equals("");
    }
}