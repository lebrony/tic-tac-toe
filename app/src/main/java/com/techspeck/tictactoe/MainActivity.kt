package com.techspeck.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun btnClick(view:View){
        var btnSelected = view as Button
        var CellID = 0
        when (btnSelected.id){
            R.id.bttn1 -> CellID= 1
            R.id.bttn2 -> CellID = 2
            R.id.bttn3 -> CellID = 3
            R.id.bttn4 -> CellID = 4
            R.id.bttn5 -> CellID = 5
            R.id.bttn6 -> CellID = 6
            R.id.bttn7 -> CellID = 7
            R.id.bttn8 -> CellID = 8
            R.id.bttn9 -> CellID = 9
        }
        playGame(CellID, btnSelected)
    }

    var playerOne = ArrayList<Int>()
    var playerTwo = ArrayList<Int>()
    var activePlayer = 1

    fun playGame(CellID:Int, btnSelected:Button){
        if (activePlayer == 1){
            btnSelected.text = "X"
            btnSelected.setBackgroundColor(Color.GREEN)
            playerTwo.add(CellID)
            activePlayer=2
            autoPlay()
        } else {
            btnSelected.text = "O"
            btnSelected.setBackgroundColor(Color.YELLOW)
            playerOne.add(CellID)
            activePlayer=1
        }
        btnSelected.isEnabled = false
        winnerCheck()
    }

    fun winnerCheck(){
        var winner = -1
        //check winning in row number 1
        if (playerOne.contains(1) && playerOne.contains(2)&&playerOne.contains(3)){
            winner=1
        }
        if (playerTwo.contains(1)&&playerOne.contains(2)&&playerOne.contains(3)){
            winner=2
        }

        //check winning in row number two
        if (playerOne.contains(4) && playerOne.contains(5)&&playerOne.contains(6)){
            winner=1
        }
        if (playerTwo.contains(4)&&playerOne.contains(5)&&playerOne.contains(6)){
            winner=2
        }

        //check winning in row number three
        if (playerOne.contains(7) && playerOne.contains(8)&&playerOne.contains(9)){
            winner=1
        }
        if (playerTwo.contains(7)&&playerOne.contains(8)&&playerOne.contains(9)){
            winner=2
        }

        //check winning in column number 1
        if (playerOne.contains(1) && playerOne.contains(4)&&playerOne.contains(7)){
            winner=1
        }
        if (playerTwo.contains(1)&&playerOne.contains(4)&&playerOne.contains(7)){
            winner=2
        }

        //check winning in column number two
        if (playerOne.contains(2) && playerOne.contains(5)&&playerOne.contains(8)){
            winner=1
        }
        if (playerTwo.contains(2)&&playerOne.contains(5)&&playerOne.contains(8)){
            winner=2
        }

        //check winning in column number three
        if (playerOne.contains(3) && playerOne.contains(6)&&playerOne.contains(9)){
            winner=1
        }
        if (playerTwo.contains(3)&&playerOne.contains(6)&&playerOne.contains(9)){
            winner=2
        }

        if (winner != -1){
            if (winner == 1){
                Toast.makeText(this,"Player One Wins", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "Player Two Wins", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun autoPlay(){
        var emptyCells = ArrayList<Int>()
        for (CellID in 1..9){
            if (!(playerOne.contains(CellID) || playerTwo.contains(CellID))){
                emptyCells.add(CellID)
            }
        }

//        val r = Random()
//        val randomIndex = r.nextInt(emptyCells.size-0)+0
//        val  cellID = emptyCells[randomIndex]
//
//        var btnSelect:Button?
//        when(cellID){
//            1-> btnSelect=
//        }

    }
}