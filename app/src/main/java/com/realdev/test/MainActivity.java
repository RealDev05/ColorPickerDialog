package com.realdev.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.realdev.colorpickerdialog.ColorPickerDialogBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorPickerDialogBuilder colorPickerDialog=new ColorPickerDialogBuilder(this);
        colorPickerDialog.show(new ColorPickerDialogBuilder.ColorPickedListener() {
            @Override
            public void OnColorPicked(int color, String hex) {
                Toast.makeText(MainActivity.this, "int : "+color+"\n hex : "+hex, Toast.LENGTH_SHORT).show();
            }
        });
    }
}