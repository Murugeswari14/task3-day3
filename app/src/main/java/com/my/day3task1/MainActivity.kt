package com.my.day3task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    var number:Int=789
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton= findViewById<TextView>(R.id.clickButton)
        val typeValue=findViewById<TextInputLayout>(R.id.typeText)
        val guess=findViewById<TextView>(R.id.guessView)

        clickButton.setOnClickListener{
          val numberGuess=typeValue.editText?.text.toString().toInt()

            if(numberGuess==0)
            {
                guess.text="Enter a valid number"
            }
            else if (numberGuess>number)
            {
                guess.text="No ,my number is smaller"

            }
            else if(numberGuess<number)
            {
                guess.text="No ,my number is bigger"
            }
            else
            {
                guess.text="Yes,you are right you won!!"
            }

        }
    }
}