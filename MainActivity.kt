package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

//4) Implement Onclick Listener. therefore inherit from onclick listener.Instead of this
//we can do from the button as on btnAdd.setOnClickListener but if you do that
// you have to do for each 4 buttons everytime,

//5) Next click on class MainActivity and implement members and click ok
class MainActivity : AppCompatActivity() ,View.OnClickListener {
    //1)define with lateinit var(Initializing variables) -The lateinit keyword allows you to avoid initializing a property when an object is constructed.
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button

    //3i)Initialize edit text
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //2)Providing ID
        btnAdd=findViewById(R.id.btn_add)
        btnSub=findViewById(R.id.btn_subtraction)
        btnMultiply=findViewById(R.id.btn_multiplication)
        btnDivision=findViewById(R.id.btn_Division)
        //3ii)
        etA=findViewById(R.id.et_a)
        etB=findViewById(R.id.et_b)
        resultTv=findViewById(R.id.result_tv)

        //11)Activate the onclick listener
        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
    }


    //6)Here instead of switch case we use when. v is the parameter
    override fun onClick(v: View?) {
        //7)To do the calculation I will make 2 local variables
        var number1=etA.text.toString().toDouble() //converting string to double to do the calculation
        var number2=etB.text.toString().toDouble()
        var result=0.0 //0.0 means double

when(v?.id){ //? -to make it null safe

   R.id.btn_add ->{
       result=number1+number2
   } //->{} means we do something //8)Add Body

    R.id.btn_subtraction ->{
        result=number1-number2
    }

    R.id.btn_multiplication ->{
        result=number1*number2
    }

    R.id.btn_Division ->{
        result=number1/number2
    }
}
        //9)Have to show the result in the result view
        resultTv.text="Result is $result"

    }
}