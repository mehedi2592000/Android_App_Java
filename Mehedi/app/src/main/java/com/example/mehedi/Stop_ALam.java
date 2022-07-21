package com.example.mehedi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stop_ALam extends AppCompatActivity {
    private Button buttonn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        buttonn =(Button) findViewById(R.id.button);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_alam);
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpensetAlamee();
            }

        });


    }
    public void OpensetAlamee(){
        Intent intent=new Intent(this,Stop_ALam.class);
        startActivity(intent);
    }

}