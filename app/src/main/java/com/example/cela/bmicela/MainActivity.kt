package com.example.cela.bmicela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.LineHeightSpan
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /*  宣告欄位*/
    lateinit var height: EditText
    lateinit var weight: EditText
    lateinit var btnstart:Button
    lateinit var btnclear:Button
    lateinit var bmival : TextView
    lateinit var bmilevel : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)
        /*  左邊變數 ID*/
         height = findViewById(R.id.height)
         weight = findViewById(R.id.weight)
         btnstart = findViewById(R.id.btnstart)
         btnclear = findViewById(R.id.btnclear)
         bmival = findViewById(R.id.bmival)
         bmilevel = findViewById(R.id.bmilevel)
        Log.d("height", height.text.toString())
        /* 清空數值*/
        btnclear.setOnClickListener()
        {
            height.setText("")
            weight.setText("")
            bmival.setText("")
            bmilevel.setText("")
        }
    }



    /*bmi計算 */
    fun bmi(view: View) {
        val weight = weight.text.toString().toFloat()
        val height = height.text.toString().toFloat()
        var bmi = weight / (height*height)
        bmival.setText(bmi.toString())
        Log.d("bmi", "bmi: ${bmi}")
        if (bmi>25)
            bmival.setText("體重過重")
        else if (bmi>20)
            bmival.setText("體重正常")
        else
            bmival.setText("體重過輕")
    }


}
