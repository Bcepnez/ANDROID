package com.example.benzrst.bcepnez1106;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by BenzRST on 16-Feb-17.
 */

public class PageActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_activity);
    }
    public void  Onclic(View view2)
    {
        Button btn_ok = (Button)findViewById(R.id.b2);
        Intent intent2 = new Intent(PageActivity.this,MainActivity.class);
        startActivity(intent2);
    }
}

