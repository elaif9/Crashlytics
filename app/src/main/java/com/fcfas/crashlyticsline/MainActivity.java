package com.fcfas.crashlyticsline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        Crashlytics.log("Start logging!");

        Crashlytics.setUserIdentifier("fcfas-1");
        Crashlytics.setUserName("Fcfas");
        Crashlytics.setUserEmail("fcfas.firebaase@gmail.com");

        Crashlytics.setString("key1", "value1");
        Crashlytics.setBool("key2", true);
        Crashlytics.setDouble("key3", 99.99);
        Crashlytics.setFloat("key4", 999.99f);
        Crashlytics.setInt("key5", 999);
        Crashlytics.setLong("key6", System.currentTimeMillis());

        bindView();
    }

    private void bindView() {
        findViewById(R.id.btn_force).setOnClickListener(this);
        findViewById(R.id.btn_exception).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
