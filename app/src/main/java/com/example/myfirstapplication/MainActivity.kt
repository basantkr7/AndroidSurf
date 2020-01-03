package com.example.myfirstapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {


    var num1:String =""
    fun updateResultTv(){

        result_et.setText(num1)

    }
    fun onClickOperator(){
        if (result_et.text.length!=0){

        }
    }

    fun onClickEquals():Double{
        var op1 : String =""
        var op2: String=""
        val o =num1.splitToSequence('+','-','*','/')

        return 0.9
    }

fun doCalc(view:View){
    when(view.id){
        R.id.num_1_tv ->{
            num1=num1+"1"
        }
        R.id.num_2_tv ->{
            num1=num1+"2"
        }
        R.id.num_3_tv ->{
            num1=num1+"3"
        }
        R.id.num_4_tv ->{
            num1=num1+"4"
        }
        R.id.num_5_tv ->{
            num1=num1+"5"
        }
        R.id.num_6_tv ->{
            num1=num1+"6"
        }
        R.id.num_7_tv ->{
            num1=num1+"7"
        }
        R.id.num_8_tv ->{
            num1=num1+"8"
        }
        R.id.num_9_tv ->{
            num1=num1+"9"
        }
        R.id.num_0_tv ->{
            num1=num1+"0"
        }
        R.id.num_decimal_tv ->{
            num1=num1+"."
        }
        R.id.plus__tv ->{

        }
        R.id.minus__tv ->{
            onClickOperator()
            num1=num1+"-"
        }
        R.id.divide__tv ->{
            onClickOperator()
            num1=num1+"/"
        }
        R.id.multiply__tv ->{
            onClickOperator()
            num1=num1+"*"
        }

    }
    updateResultTv()


}


    val clickListner= View.OnClickListener{
        doCalc(it)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

       /* num_1_tv.setOnClickListener(clickListner)
        num_1_tv.setOnClickListener(clickListner)
        num_1_tv.setOnClickListener(clickListner)
        num_1_tv.setOnClickListener(clickListner)
        num_1_tv.setOnClickListener(clickListner)*/




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun clickListner(view: View) {
        doCalc(view)


    }

}
