package com.example.getwebpagesourcecode

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.koushikdutta.ion.Ion
import android.widget.Spinner
import android.text.method.ScrollingMovementMethod
import android.view.View
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import java.io.IOException
import java.net.MalformedURLException
import java.net.URL

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var string: String
    lateinit var textView: TextView
    lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.get_code)
        editText = findViewById(R.id.text_input)
        textView = findViewById(R.id.display_source)
        spinner = findViewById(R.id.sp_name);




        button.setOnClickListener {

            string = editText.text.toString()

            Ion.with(applicationContext).load(spinner.getSelectedItem().toString() + string).asString()
                .setCallback { e, result ->
                    textView.setText(
                        result
                    )
                }
        }

    }}
