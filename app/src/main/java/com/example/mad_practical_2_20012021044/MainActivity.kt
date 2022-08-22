package com.example.mad_practical_2_20012021044

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private var TAG="mainactivity"
    private lateinit var mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "onCreate:onCreate method is called ")
        Toast.makeText(this,"onCreate:onCreate method is called ", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "onCreate:onCreate method is called ")
        Toast.makeText(this,"onCreate:onCreate method is called ", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG, "onCreate:onCreate method is called ")
        Toast.makeText(this,"onCreate:onCreate method is called ", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG, "onCreate:onCreate method is called ")
        Toast.makeText(this,"onCreate:onCreate method is called ", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()

        Log.i(TAG, "onCreate:onCreate method is called ")
        Toast.makeText(this,"onCreate:onCreate method is called ", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "onCreate:onCreate method is called ")
        Toast.makeText(this,"onCreate:onCreate method is called ", Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate method is called",Snackbar.LENGTH_LONG).show()
    }
}