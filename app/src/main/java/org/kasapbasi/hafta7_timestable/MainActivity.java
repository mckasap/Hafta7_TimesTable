package org.kasapbasi.hafta7_timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

SeekBar sb;
TextView tv;
ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb=(SeekBar) findViewById(R.id.seekBar);
        tv=(TextView) findViewById(R.id.textView);
        lv=(ListView)findViewById(R.id.myLv);

        sb.setMax(20);
        sb.setMin(1);
        sb.setProgress(10);

        sb.



    }
}
