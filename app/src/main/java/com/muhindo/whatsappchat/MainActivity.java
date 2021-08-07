package com.muhindo.whatsappchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.muhindo.whatsappchat.activity.ChatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open_chat(View view) {
        Intent i = new Intent(this, ChatActivity.class);
        startActivity(i);
    }
}