package org.kasapbasi.hafta7_timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

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
    infilate(10);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                infilate(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }

    private void infilate(int progress) {
        tv.setText(""+progress);
        ArrayList<String> mycontent= new ArrayList<>();
        for(int i=1;i<=12;i++){
            mycontent.add(""+progress+"*"+i+"="+(i*progress));
        }
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, mycontent);
        lv.setAdapter(adaptor);
    }
}
