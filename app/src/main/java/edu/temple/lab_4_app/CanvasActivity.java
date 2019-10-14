package edu.temple.lab_4_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent myIntent = getIntent();
        String strColor = myIntent.getStringExtra("Color");

        //String tips = "You select " + strColor + " color.";
        //Toast toast=Toast.makeText(getApplicationContext(),tips,Toast.LENGTH_LONG);
        //toast.setMargin(50,50);
        //toast.show();

        View myLayout = findViewById(R.id.canvasLayout);
        myLayout.setBackgroundColor(Color.parseColor(strColor));
    }
}
