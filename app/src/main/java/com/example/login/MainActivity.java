package com.example.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.login.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.login_button);
        TextView forgotPasswordTextView = findViewById(R.id.forgot_password);

        // Set up click listener for login button (placeholder)
        loginButton.setOnClickListener(v -> {
            // Add login logic here
        });

        // Set up click listener for forgot password (placeholder)
        forgotPasswordTextView.setOnClickListener(v -> {
            // Add forgot password logic here
        });
    }
}