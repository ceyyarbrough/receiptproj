package com.receiptsaver.receiptsaver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {


    private Button loginButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton1 = (Button) findViewById(R.id.loginButton1);
        loginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPageOpen();
            }
        });
    }

    public void loginPageOpen(){
        Intent openLoginPage = new Intent(this, loginMain.class);
        startActivity(openLoginPage);
    }



}