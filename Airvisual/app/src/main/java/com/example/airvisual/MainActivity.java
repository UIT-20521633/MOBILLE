package com.example.airvisual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editEmail;
    private com.google.android.material.button.MaterialButton buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail = findViewById(R.id.mail);
        buttonlogin =findViewById(R.id.signup);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
    }

    private void nextActivity() {
        String sEmail = editEmail.getText().toString().trim();
        Apputil.mEmail= sEmail;
//        chuyển dữ liệu từ activity nay sang activity khác
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);

    }
}