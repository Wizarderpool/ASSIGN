package com.myweb.ass5_sec3_613020172_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data: Bundle? = intent.extras
        var newEmployee: Employee? = data?.getParcelable<Employee>("employee")
        showName.text = "Employee Name: ${newEmployee?.Name}"
        showGender.text = "Gender: ${newEmployee?.Gender}"
        showMail.text = "E-mail: ${newEmployee?.mail}"
        showSalary.text = "Salary: ${newEmployee?.salary}"
        onClickClose()
    }
    fun onClickClose(){
        btnClose.setOnClickListener{
            finish()
        }
    }
}