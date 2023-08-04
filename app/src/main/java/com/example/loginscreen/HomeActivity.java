package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnLout;
        btnLout=findViewById(R.id.logout);
        btnLout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref=getSharedPreferences("Login",MODE_PRIVATE);
                SharedPreferences.Editor editor= pref.edit();

                editor.putBoolean("flag",false);
                editor.apply();
                Intent ihome=new Intent(HomeActivity.this,LoginActivity.class);

                startActivity(ihome);
            }
        });
    }
}