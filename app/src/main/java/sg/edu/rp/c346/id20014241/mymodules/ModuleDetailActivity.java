package sg.edu.rp.c346.id20014241.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.textViewModCode);

        Intent intentReceived = getIntent();
        String modCode = intentReceived.getStringExtra("Module Code");
        String modName = intentReceived.getStringExtra("Module Name");
        Integer ay = intentReceived.getIntExtra("Academic Year", 0);
        Integer sem = intentReceived.getIntExtra("Semester", 0);
        Integer modCred = intentReceived.getIntExtra("Module Credit",0);
        String venue = intentReceived.getStringExtra("Venue");
        tvDisplay.setText("Module Code: " + modCode + "\nModule Name: " + modName + "\nAcademic Year: "
                + ay + "\nSemester: " + sem + "\nModule Credit: " + modCred + "\nVenue: " + venue);
    }
}