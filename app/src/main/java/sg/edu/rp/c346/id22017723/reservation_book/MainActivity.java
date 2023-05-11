package sg.edu.rp.c346.id22017723.reservation_book;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Variables
    EditText name;
    EditText number;
    EditText group;
    DatePicker date;
    TimePicker time;
    RadioGroup smoke;
    TextView display;
    TextView display2;
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
        display2 = findViewById(R.id.display2);
        book = findViewById(R.id.book);
        reset = findViewById(R.id.reset);

    display.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            // Functionality for the button...
            //I have no idea what I am doing. I am sorry.
            date.updateDate(2020,6,1);
            time.setHour(19);
            time.setMinute(30);

            int month,day,year;
            day = date.getDayOfMonth();
            month = date.getMonth();
            year = date.getYear();

            int hour,minute;
            hour = time.getHour();
            minute = time.getMinute();

            int radio = smoke.getCheckedRadioButtonId();
            if(radio == R.id.smokingyes){
                display2.setText("Yes");
            }
            else{
                display2.setText("No");
            }

            display.setText("Name: " + name.getText().toString() + " Number: " + number.getText().toString() +
                    " Group Size: " + group.getText().toString() + " Date: " + day + "" + month + "" + year
            + " Timing: " + hour + ":" + minute + " Smoking: " + display2);

            Log.i("MyActivity", "onClick: ");
            Toast.makeText(MainActivity.this, display.getText().toString(), Toast.LENGTH_LONG).show()
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