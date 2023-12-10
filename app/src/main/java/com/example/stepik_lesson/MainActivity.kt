package com.example.stepik_lesson

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var isChecked: Boolean = false
        val textView: TextView = findViewById(R.id.txt)
        val button: Button = findViewById(R.id.btn)
        val resources: Resources = resources
        val editText: EditText = findViewById(R.id.editTextTextPersonName)

        button.setOnClickListener{
            if (!isChecked) {
                textView.setBackgroundResource(R.color.teal_700)
                textView.setTextColor(resources.getColor(R.color.orange))
                textView.text = editText.text.toString()
                isChecked = true
                editText.text.clear()

            } else {
                textView.setBackgroundResource(R.color.white)
                textView.setTextColor(resources.getColor(androidx.transition.R.color.secondary_text_default_material_light))
                isChecked = false
            }

        }
        textView.setOnClickListener {
            textView.setTextColor(resources.getColor(R.color.red))
        }



    }

}