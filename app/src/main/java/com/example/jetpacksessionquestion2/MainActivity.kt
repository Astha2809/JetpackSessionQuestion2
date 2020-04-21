package com.example.jetpacksessionquestion2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var button_changecolor: Button
    var model: ChangeColorGenerator? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model = ViewModelProviders.of(this).get(ChangeColorGenerator::class.java)

        initUi()

    }


    private fun initUi() {
        button_changecolor = findViewById(R.id.button)
        //var changeColorGenerator=ChangeColorGenerator()
        // var model=ChangeColorGenerator()
        model?.myColor?.let {

                button_changecolor.setBackgroundColor(it)


        }



        button_changecolor.setOnClickListener(View.OnClickListener {
            //           val myColor: Unit =changeColorGenerator.createColor()
//            button_changecolor.setBackgroundColor(myColor)
            //var model=ViewModelProvider(this).get(ChangeColorGenerator::class.java)

            var myColor = model?.createColor()

            myColor?.let {

                button_changecolor.setBackgroundColor(it)

            }


        })
        //let,with,run,apply(scope functions),also,takeif
        // model?.let


    }


}




