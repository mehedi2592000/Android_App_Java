package com.example.mehedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById(R.id.button);
        button2=findViewById(R.id.botton2);
        button3=findViewById(R.id.bottonn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpensetAlam();
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSchedul();
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {StartAlarm();
            }

        });

    }


    public void StartAlarm(){
        Intent intent=new Intent(this,StartAlarm.class);
        startActivity(intent);
    }
    public void OpensetAlam(){
        Intent intent=new Intent(this,OpensetAlam.class);
        startActivity(intent);
    }

    public void openSchedul(){
        Intent intent=new Intent(this,openSchedul.class);
        startActivity(intent);
    }
}