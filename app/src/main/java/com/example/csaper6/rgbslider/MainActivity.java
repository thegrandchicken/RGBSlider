package com.example.csaper6.rgbslider;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends AppCompatActivity {

    private SeekBar r;
    private SeekBar g;
    private SeekBar b;
    private int rValue;
    private int gValue;
    private int bValue;
    private TextView textR;
    private TextView textG;
    private TextView textB;
    private RelativeLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setSeekBarProperties();
        setListeners();
    }

    private void setSeekBarProperties() {
        r.setMax(255);
        g.setMax(255);
        b.setMax(255);
    }

    private void changeBackgroundColor() {
        background.setBackgroundColor(Color.rgb(rValue, gValue, bValue));
    }

    private void wireWidgets() {
        r = (SeekBar) findViewById(R.id.seekBar_r);
        g = (SeekBar) findViewById(R.id.seekBar_g);
        b = (SeekBar) findViewById(R.id.seekBar_b);
        textR = (TextView) findViewById(R.id.textView_r);
        textG = (TextView) findViewById(R.id.textView_g);
        textB = (TextView) findViewById(R.id.textView_b);
        background = (RelativeLayout) findViewById(R.id.background);
    }

    private void setListeners() {
        r.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rValue = r.getProgress();
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        g.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                gValue = g.getProgress();
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        b.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bValue = b.getProgress();
                changeBackgroundColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
