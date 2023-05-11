package sg.edu.rp.c346.id22017723.reservation_book;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    //Variables
    EditText name;
    EditText number;
    EditText group;
    DatePicker date;
    TimePicker time;
    RadioGroup smoke;
    TextView display;
    Button book;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding...
        name = findViewById(R.id.entername);
        number = findViewById(R.id.enternumber);
        group = findViewById(R.id.entergroupsize);
        date = findViewById(R.id.datePicker);
        time = findViewById(R.id.timePicker);
        smoke = findViewById(R.id.smokingqns);
        display = findViewById(R.id.display);
        book = findViewById(R.id.book);
        reset = findViewById(R.id.reset);

    display.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            // Functionality for the button...

            date.updateDate(2020,6,1);
            time.setHour(19);
            time.setMinute(30);

            int month,day,year;
            day = date.getDayOfMonth();
            month = date.getMonth();
            year = date.getYear();

        }
    });

        reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name.setText("");
            number.setText("");
            group.setText("");
            display.setText("");
            date.updateDate(2020,6,1);
            time.setHour(19);
            time.setMinute(30);
            smoke.clearCheck();




        }
    });
}
}