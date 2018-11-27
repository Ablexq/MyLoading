package com.xq.e.myloading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) this.findViewById(R.id.btn1)).setOnClickListener(this);
        ((TextView) this.findViewById(R.id.btn2)).setOnClickListener(this);
        ((TextView) this.findViewById(R.id.btn3)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this, Test1Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this, Test2Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(MainActivity.this, Test3Activity.class));
                break;
        }
    }
}
