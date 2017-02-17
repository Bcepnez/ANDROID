package com.example.benzrst.bcepnez1106;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void  OnclickOk(View view)
    {
        Button btn = (Button)findViewById(R.id.b1);
        Intent intent = new Intent(MainActivity.this,PageActivity.class);
        startActivity(intent);
    }
}
