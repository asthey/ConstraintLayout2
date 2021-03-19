package com.example.constraintlayout2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {

    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString("parameter1");
        String pass = bundle.getString("parameter2");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}
