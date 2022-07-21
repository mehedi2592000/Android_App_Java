package com.example.mehedi;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OpensetAlam extends AppCompatActivity {

    private EditText mEditTextInput;
    private TextView mTextViewCountDown;
    private Button mButtonSet;
    private Button mButtonStartPause;
    private Button mButtonReset;
    private Button buttonn;
    private CountDownTimer mCountDownTimer;

    private boolean mTimerRunning;


    private long mStartTimeInMillis;
    private long mTimeLeftInMillis;
    private long mEndTime;

    Button but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openset_alam);

        mEditTextInput = findViewById(R.id.edit_text_input);
        mTextViewCountDown = findViewById(R.id.text_view_countdown);

        mButtonSet = findViewById(R.id.button_set);
       // mButtonStartPause = findViewById(R.id.button_start_pause);


        mButtonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = mEditTextInput.getText().toString();

                long millisInput = Long.parseLong(input) * 60000;

              //  setTime(millisInput);
                mEditTextInput.setText("");

            }
        });



    }
}