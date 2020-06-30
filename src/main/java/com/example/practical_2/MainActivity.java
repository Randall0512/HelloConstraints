package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.graphics.Color;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button mCountZero;
    private Button mCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mCountZero = findViewById(R.id.button_zero);
        mCountButton = findViewById(R.id.button_count);
    }
//




    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toastmessage, Toast.LENGTH_SHORT);

        toast.show();

    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null){
            mShowCount.setText(String.format(Locale.ENGLISH, "%d", mCount));
        }
        mCountZero.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        mCountZero.setClickable(true);

        switch (mCount % 2){
            case 0: view.setBackgroundColor(Color.MAGENTA);
                break;
            case 1: view.setBackgroundColor(Color.GREEN);
                break;
            default: break;
        }

    }

    public void countZero(View view) {
        mCount = 0;
        if(mShowCount!= null){
            mShowCount.setText(Integer.toString(mCount));
        }
        view.setClickable(false);
        view.setBackgroundColor(Color.GRAY);
        mCountButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }
}