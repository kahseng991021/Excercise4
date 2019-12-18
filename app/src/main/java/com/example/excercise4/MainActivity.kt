package com.example.excercise4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Month
import java.util.*

class MainActivity : AppCompatActivity() {
val c:Calendar = Calendar.getInstance();
    val cYear = c.get(Calendar.YEAR);
    val cMonth = c.get(Calendar.MONTH);
    val cDay = c.get(Calendar.DAY_OF_MONTH);
    var cal:Int=0
    var result:String =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener(){
            val dateTimeDialog = DatePickerDialog(this,

                DatePickerDialog.OnDateSetListener{
                view, year, month, dayOfMonth ->
                    txtDate.setText(dayOfMonth.toString() + "-" +(month +1) +"-" +year)
            },cYear,cMonth,cDay

            )
            dateTimeDialog.show()

            if(cYear >= 2015  ||cYear <= 2019)
            {
                cal =5000

            }else if(cYear >= 2010  ||cYear <=2014 )
            {
                cal =14000

            }
            else if(cYear >= 2005  ||cYear <=2009)
            {
                cal =29000
            }
            else if(cYear >= 2000  ||cYear <=2004)
            {
                cal =50000
            }


        }
        btn1.setOnClickListener(){
textView5.setText(cal.toString())
        }


    }
}
