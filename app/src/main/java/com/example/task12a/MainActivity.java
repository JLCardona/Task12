package com.example.task12a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mCount = 0;
    String KEY_COUNT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            mCount = savedInstanceState.getInt(KEY_COUNT);

            TextView mShowCount = (TextView) findViewById(R.id.show_count);
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void countUp(View view) {
        mCount++;
        TextView mShowCount = (TextView) findViewById(R.id.show_count);
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        Toast.makeText(this, Integer.toString(mCount), Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, mCount);
    }
}