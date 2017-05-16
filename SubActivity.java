package com.dean92.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void onClickButtonBack(View view) {
        Toast.makeText(getApplicationContext(),"메인화면으로 이동합니다.", Toast.LENGTH_LONG).show();
        finish();
    }
}
