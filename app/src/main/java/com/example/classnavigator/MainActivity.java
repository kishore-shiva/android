package com.example.classnavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView day,date_l,info;
    Button period1,period2,period3,period4;
    String days;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date date = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        day = findViewById(R.id.textView9);
        day.setText(simpleDateformat.format(date));
        days = simpleDateformat.format(date);

        SimpleDateFormat date1 = new SimpleDateFormat("(dd-MM-yyyy)");
        date_l = (TextView)findViewById(R.id.textView5);
        date_l.setText(date1.format(date));


        period1 = findViewById(R.id.button2);
        period2 = findViewById(R.id.button3);
        period3 = findViewById(R.id.button4);
        period4 = findViewById(R.id.button5);

        period1.setText("No Class");
        period2.setText("No Class");
        period3.setText("No Class");
        period4.setText("No Class");


        if(day.getText().equals("Monday")){
            period1.setText("DPSD"); period2.setText("DM");
            period3.setText("CE"); period4.setText("DS");

        }
        else if(day.getText().equals("Tuesday")){
            period1.setText("OOP"); period2.setText("DS");
            period3.setText("DM"); period4.setText("CE");

        }
        else if(day.getText().equals("Wednesday")){
            period1.setText("DS"); period2.setText("CE");
            period3.setText("OOP"); period4.setText("DPSD");

        }
        else if(day.getText().equals("Thursday")){
            period1.setText("CE"); period2.setText("OOP");
            period3.setText("DM"); period4.setText("DPSD");

        }
        else if(day.getText().equals("Friday")){
            period1.setText("OOP"); period2.setText("DM");
            period3.setText("DS"); period4.setText("DPSD");

        }
        else if(day.getText().equals("Saturday")){
            period1.setText("DM"); period2.setText("DS");
            period3.setText("CE"); period4.setText("DPSD");

        }

        period1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(day.getText().equals("Monday")){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/edergmpxep")));
                }
                else if(day.getText().equals("Tuesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vqsrturrdh")));
                }
                else if(day.getText().equals("Wednesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/kxwirwonmq")));
                }
                else if(day.getText().equals("Thursday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/dyoamxwphp")));
                }
                else if(day.getText().equals("Friday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vqsrturrdh")));
                }
                else if(day.getText().equals("Saturday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vpcupptyij")));
                }
            }
        });

        period2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(day.getText().equals("Monday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vpcupptyij")));
                }
                else if(day.getText().equals("Tuesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vqsrturrdh")));
                }
                else if(day.getText().equals("Wednesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/dyoamxwphp")));
                }
                else if(day.getText().equals("Thursday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vqsrturrdh")));
                }
                else if(day.getText().equals("Friday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vpcupptyij")));
                }
                else if(day.getText().equals("Saturday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/kxwirwonmq")));
                }
            }
        });

        period3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(day.getText().equals("Monday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/dyoamxwphp")));
                }
                else if(day.getText().equals("Tuesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vpcupptyij")));
                }
                else if(day.getText().equals("Wednesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vqsrturrdh")));
                }
                else if(day.getText().equals("Thursday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/vpcupptyij")));
                }
                else if(day.getText().equals("Friday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/kxwirwonmq")));
                }
                else if(day.getText().equals("Saturday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/dyoamxwphp")));
                }
            }
        });

        period4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(day.getText().equals("Monday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/edergmpxep")));
                }
                else if(day.getText().equals("Tuesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/dyoamxwphp")));
                }
                else if(day.getText().equals("Wednesday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/edergmpxep")));
                }
                else if(day.getText().equals("Thursday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/edergmpxep")));
                }
                else if(day.getText().equals("Friday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/edergmpxep")));
                }
                else if(day.getText().equals("Saturday")){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://meet.google.com/edergmpxep")));
                }
            }
        });
    }
}
