package com.techspeck.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun btnClick(view:View){
        val btnSelected = view as Button
        var CellID = 0
        when (btnSelected.id){
            R.id.bttn1 -> CellID=1
            R.id.bttn2 -> CellID = 2
            R.id.bttn3 -> CellID = 3
            R.id.bttn4 -> CellID = 4
            R.id.bttn5 -> CellID = 5
            R.id.bttn6 -> CellID = 6
            R.id.bttn7 -> CellID = 7
            R.id.bttn8 -> CellID = 8
            R.id.bttn9 -> CellID = 9
        }
    }
}