package com.example.mehedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById(R.id.button);
        button2=findViewById(R.id.botton2);
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