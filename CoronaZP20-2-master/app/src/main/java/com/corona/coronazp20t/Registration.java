package com.corona.coronazp20t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button register=findViewById(R.id.register);
        final EditText username=findViewById(R.id.username);
        final EditText email=findViewById(R.id.email);
        final EditText password=findViewById(R.id.password);
        final String register_invalid_validation;


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (Validation.isValidUsername(username.getText().toString()) &&
                        Validation.isValidPassword(email.getText().toString()) &&
                        Validation.isValidPassword(password.getText().toString()))  {

                    Intent goToLoginActivity = new Intent(Registration.this, LoginActivity.class);
                    startActivity(goToLoginActivity);

                    Toast.makeText(Registration.this,"Prisijungimo vardas:  "+
                            username.getText().toString() + "\n" + "Slaptazodis:  " +
                            password.getText().toString() + "\n" + "Email:  " + email.getText().toString(), Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}