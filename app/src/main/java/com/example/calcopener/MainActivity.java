package com.example.calcopener;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.Button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("calc://open");
                Intent calcOpener = new Intent(Intent.ACTION_VIEW, uri);
                ActivityInfo activityInfo = calcOpener.resolveActivityInfo(getPackageManager(), calcOpener.getFlags());
                if (activityInfo != null) {
                    startActivity(calcOpener);
                }
            }
        });
    }
}