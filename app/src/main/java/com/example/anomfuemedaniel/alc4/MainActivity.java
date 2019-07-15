package com.example.anomfuemedaniel.alc4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Toolbar toolbar = findViewById(R.id.toolbar_home);
            setSupportActionBar(toolbar);


         button = findViewById(R.id.button_about_alc);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openActivityWebview();
             }

         });

         button = findViewById(R.id.button_my_profile);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openActivityProfile();
             }
         });

        }

        public void openActivityWebview() {
            Intent intent = new Intent(MainActivity.this, Activity_Webview.class);
            startActivity(intent);
        }


        public void openActivityProfile() {
        Intent intent = new Intent (MainActivity.this, ActivityProfile.class);
        startActivity(intent);
        }
    }




