package com.example.projectnewyorksubway;


import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityELine extends AppCompatActivity {

    //private static final String TAG = "ActivityE";

    //private SharedPreferences myEPrefs;
   // private SharedPreferences.Editor myEEditor;
   private int numberE = 0;

    private TextView numVisitedE; //the number of people that have been to the E line before
   // Button btnE;

   // private int number, someNumber;


   // RadioButton radioBtnE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eline);



        numVisitedE = findViewById(R.id.totalNumE);
    Button btnE = findViewById(R.id.btnHereE);

    //load how many people have been here
        SharedPreferences myEPrefs = this.getSharedPreferences(getString(R.string.my_number_E),Context.MODE_PRIVATE);
        numberE = myEPrefs.getInt(getString(R.string.number_E), 0);

        //must .setText to update the number of people
        numVisitedE.setText(String.valueOf(numberE));

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberE += 1;

                SharedPreferences myEPrefs = getSharedPreferences(getString(R.string.my_number_E), Context.MODE_PRIVATE);
                SharedPreferences.Editor myEEditor = myEPrefs.edit();
                myEEditor.putInt(getString(R.string.number_E), numberE);
                myEEditor.apply();

                numVisitedE.setText(String.valueOf(numberE));
            }
        });






        RadioButton radioBtnE = findViewById(R.id.radioButtonE);
        radioBtnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityELine.this,getString(R.string.fact_e), Toast.LENGTH_LONG).show();

            }
        });
    }

}



/*
public class ActivityELine extends AppCompatActivity {

    //private static final String TAG = "ActivityE";

    //private SharedPreferences myEPrefs;
   // private SharedPreferences.Editor myEEditor;
    int numberE = 0;

    private TextView numVisitedE; //the number of people that have been to the E line before
    private Button btnE;

   // private int number, someNumber;


    RadioButton radioBtnE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eline);



        numVisitedE = (TextView) findViewById(R.id.totalNumE);
    btnE = (Button) findViewById(R.id.btnHereE);

    //load how many people have been here
        SharedPreferences myEPrefs = this.getSharedPreferences("My number",Context.MODE_PRIVATE);
        numberE = myEPrefs.getInt("number", 0);

        //must .setText to update the number of people
        numVisitedE.setText("number: " + numberE);

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberE += 1;

                SharedPreferences myEPrefs = getSharedPreferences("My number", Context.MODE_PRIVATE);
                SharedPreferences.Editor myEEditor = myEPrefs.edit();
                myEEditor.putInt("number", numberE);
                myEEditor.commit();

                numVisitedE.setText("number: " + numberE);
            }
        });


*/

/*

        radioBtnE = (RadioButton)findViewById(R.id.radioButtonE);
        radioBtnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityELine.this,"The E line is one of the" +
                        "most used services in the NYC subway system", Toast.LENGTH_LONG).show();

            }
        });
    }
     */
    /*
    check shared prefs
     */
// private void checkSharedPrefsE() {
//check all key value pairs:
//String number = myEPrefs.getString(getString(R.string.number), "");
// }



