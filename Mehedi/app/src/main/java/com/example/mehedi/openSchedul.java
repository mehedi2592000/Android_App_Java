package com.example.mehedi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class openSchedul extends AppCompatActivity {
    static final int ALARM_REQ_CODE=100;
    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_schedul);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
        //attaching clicklistener on button
        findViewById(R.id.buttonAlarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //We need a calendar object to get the specified time in millis
                //as the alarm manager method takes time in millis to setup the alarm
                Calendar calendar = Calendar.getInstance();
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                            timePicker.getHour(), timePicker.getMinute(), 0);
                } else {
                    calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
                            timePicker.getCurrentHour(), timePicker.getCurrentMinute(), 0);
                }


                int time=Integer.parseInt(((EditText)(findViewById(R.id.edit_text_input))).getText().toString());
                long triggerTime=System.currentTimeMillis()+(time*1000);
                Intent iBroadCast=new Intent(openSchedul.this,MyAlarm.class);
                PendingIntent pi=PendingIntent.getBroadcast(openSchedul.this,ALARM_REQ_CODE,iBroadCast,PendingIntent.FLAG_UPDATE_CURRENT);
                alarmManager.set(AlarmManager.RTC_WAKEUP,triggerTime,pi);
               Toast.makeText(openSchedul.this,"your Alarm is set",Toast.LENGTH_SHORT).show();
                StartAlarm();


              //  setAlarm(calendar.getTimeInMillis());
            }
        });
    }

    public void StartAlarm(){
        Intent intent=new Intent(this,StartAlarm.class);
        startActivity(intent);
    }

}