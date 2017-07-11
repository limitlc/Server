package com.lichuang.server;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button mBtStart, mBtStop, mBtSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtSetting = findV(R.id.bt_setting);
        mBtStop = findV(R.id.bt_stop);
        mBtStart = findV(R.id.bt_start);
        mBtStart.setOnClickListener(this);
        mBtStop.setOnClickListener(this);
        mBtSetting.setOnClickListener(this);
    }

    /**
     *
     * @param id 资源id
     * @param <T>
     * @return
     */
    private<T extends View> T findV(int id){
        return (T) findViewById(id);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_start:
                onStartClick();
                break;
            case R.id.bt_stop:
                onStopClick();
                break;
            case R.id.bt_setting:
                onSettingClick();
                break;
        }
    }
    public void onStartClick() {
        Intent intent = new Intent(this, WebService.class);
        startService(intent);
    }

    public void onStopClick() {
        Intent intent = new Intent(this, WebService.class);
        stopService(intent);
    }

    public void onSettingClick() {

    }
}
