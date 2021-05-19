package sg.edu.rp.c346.id20014241.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewC346, textViewC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewC346 = findViewById(R.id.textVIewC346);
        textViewC349 = findViewById(R.id.textViewC349);

        textViewC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDetails = new Intent(MainActivity.this, ModuleDetailActivity.class);
                openDetails.putExtra("Module Code", "C346");
                openDetails.putExtra("Module Name", "Android Programming");
                openDetails.putExtra("Academic Year", 2020);
                openDetails.putExtra("Semester", 1);
                openDetails.putExtra("Module Credit", 4);
                openDetails.putExtra("Venue", "W66M");
                startActivity(openDetails);
            }
        });

        textViewC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDetails = new Intent(MainActivity.this, ModuleDetailActivity.class);
                openDetails.putExtra("Module Code", "C349");
                openDetails.putExtra("Module Name", "iPad Programming");
                openDetails.putExtra("Academic Year", 2020);
                openDetails.putExtra("Semester", 1);
                openDetails.putExtra("Module Credit", 4);
                openDetails.putExtra("Venue", "W66M");
                startActivity(openDetails);
            }
        });
    }
}