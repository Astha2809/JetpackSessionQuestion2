package com.example.jetpacksessionquestion2

import android.graphics.Color
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModel
import java.util.*
import java.util.logging.Logger

class ChangeColorGenerator : ViewModel() {

    //   private val myColor:String
//       get() {
//           TODO()
//           createColor()
//           return myColor
//
//       }
//
//
//    fun createColor(){
//        val random= Random()
//         val myColor= Color.argb(255,random.nextInt(265),random.nextInt(265),random.nextInt(265))
//    }
    var myColor: Int = -1
    val random = Random()
    fun createColor(): Int {
        myColor = Color.argb(255, random.nextInt(265), random.nextInt(265), random.nextInt(265))
        return myColor
    }

    override fun onCleared() {
        super.onCleared()
        //Toast.makeText(this,"hello",long)
//         val Log = Logger.getLogger(ChangeColorGenerator::class.java.name)
//         Log.warning("Hello")
        Log.i("ChangecolorGenerator", "entered")
    }

}