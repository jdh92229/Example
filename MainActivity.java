package com.dean92.ex1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1(View view){
        Intent myIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://dean92.tistory.com"));
        startActivity(myIntent);
    }

    public void onClickButton2(View view){
        Intent myIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0000"));
        startActivity(myIntent);
    }

    public void onClickButton3(View view){
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);
    }
}
