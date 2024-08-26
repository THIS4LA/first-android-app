package com.example.second_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText fName, uName, address, phone, email, password, cPassword;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        fName = findViewById(R.id.etFName);
        uName = findViewById(R.id.etUName);
        address = findViewById(R.id.etAddress);
        phone = findViewById(R.id.etPhone);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        cPassword = findViewById(R.id.etCPassword);

        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = fName.getText().toString().trim();
                String userName = uName.getText().toString().trim();
                String userAddress = address.getText().toString().trim();
                String userPhone = phone.getText().toString().trim();
                String userEmail = email.getText().toString().trim();
                //String userPassword = password.getText().toString().trim();
                //String confirmPass = cPassword.getText().toString().trim();

                String details = "Full Name: " + fullName + "\n" +
                        "Username: " + userName + "\n" +
                        "Address: " + userAddress + "\n" +
                        "Phone: " + userPhone + "\n" +
                        "Email: " + userEmail;

                Toast.makeText(MainActivity.this, details, Toast.LENGTH_LONG).show();
            }
        });
    }
}