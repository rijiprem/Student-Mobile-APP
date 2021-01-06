package com.riji.studentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {
        var getStudentName=findViewById<EditText>(R.id.sname);
        var getAdmissionNumber=findViewById<EditText>(R.id.adnum);
        var getRollNumber=findViewById<EditText>(R.id.roll);
        var getCollegeName=findViewById<EditText>(R.id.college);
        Toast.makeText(this,getStudentName.text.toString()+"  "+
        getAdmissionNumber.text.toString()+"  "+getRollNumber.text.toString()+"  "+
        getCollegeName.text.toString(),Toast.LENGTH_LONG).show();
    }
}