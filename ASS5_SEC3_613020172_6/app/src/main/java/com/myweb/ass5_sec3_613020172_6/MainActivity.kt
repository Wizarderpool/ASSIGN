package com.myweb.ass5_sec3_613020172_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickSendData()
        onClickReset()
    }
    fun onClickSendData(){
        btnSend.setOnClickListener{
            val selectID:Int = radioGroup.checkedRadioButtonId
            val checkedRadioText: RadioButton = findViewById(selectID)
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("employee", Employee(edit_name.text.toString(), checkedRadioText.text.toString(), editMail.text.toString(), editSalary.text.toString().toInt()))
            startActivity(intent)
        }
    }
    fun onClickReset(){
        btnReset.setOnClickListener{
            edit_name.text?.clear()
            editMail.text?.clear()
            editSalary.text.clear()
            radioGroup.clearCheck()
        }
    }
}