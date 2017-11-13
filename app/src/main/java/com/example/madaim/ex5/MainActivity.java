package com.example.madaim.ex5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.rlDad);
        TextView tv1 = (TextView) findViewById(R.id.tvIntro);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.ll1);
        ll1.setOrientation(LinearLayout.VERTICAL);
        ll1.setLayoutParams(new LinearLayout);



    }




}
