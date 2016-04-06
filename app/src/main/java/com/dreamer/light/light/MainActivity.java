package com.dreamer.light.light;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.gc.materialdesign.views.Slider;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btn_con,btn_onoff;
    private TextView tv_state,tv_brightness;
    private Slider slider_bri;
    private Switch switch_lig;
    LinearLayout layout_bri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        initlistener();

    }

    private void initlistener() {
//        btn_onoff.setOnClickListener(this);
//        btn_con.setOnClickListener(this);
//        slider_bri.setOnValueChangedListener(this);
//        switch_lig.setOncheckListener(this);
    }

    private void initview() {
//        btn_con= (ImageButton) findViewById(R.id.btn_con);
//        btn_onoff= (ImageButton) findViewById(R.id.btn_con);
//        tv_state= (TextView) findViewById(R.id.tv_state);
//        tv_brightness= (TextView) findViewById(R.id.tv_brightness);
////        slider_bri= (Slider) findViewById(R.id.slider_bri);
////        switch_lig= (Switch) findViewById(R.id.switch_lig);
//        layout_bri= (LinearLayout) findViewById(R.id.layout_bri);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
//            case R.id.btn_con:break;
//            case R.id.btn_onoff:break;
        }
    }


}
