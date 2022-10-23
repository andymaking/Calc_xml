package io.king.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var one = findViewById<TextView>(R.id.one)
        var two = findViewById<TextView>(R.id.two)
        var three = findViewById<TextView>(R.id.three)
        var four = findViewById<TextView>(R.id.four)
        var five = findViewById<TextView>(R.id.five)
        var six = findViewById<TextView>(R.id.six)
        var seven = findViewById<TextView>(R.id.seven)
        var zero = findViewById<TextView>(R.id.zero)
        var eight = findViewById<TextView>(R.id.eight)
        var nine = findViewById<TextView>(R.id.nine)
        var dot = findViewById<TextView>(R.id.dot)
        var percent = findViewById<TextView>(R.id.percent)
        var equal = findViewById<TextView>(R.id.equal)
        var minus = findViewById<TextView>(R.id.minus)
        var plus = findViewById<TextView>(R.id.plus)
        var backSpace = findViewById<TextView>(R.id.backSpace)
        var ac = findViewById<TextView>(R.id.ac)
        var divide = findViewById<TextView>(R.id.divide)
        var edits = findViewById<TextView>(R.id.edits)
        var finals = findViewById<TextView>(R.id.finals)

        zero.setOnClickListener{
            var exist = edits.text.toString()
            var text = zero.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+exist+text
                finals.text = ""
            }
        }
        one.setOnClickListener {
            var text = one.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+exist+text
                finals.text = ""
            }
        }
        two.setOnClickListener {
            var text = two.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+exist+text
                finals.text = ""
            }
        }
        three.setOnClickListener {
            var text = three.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+exist+text
                finals.text = ""
            }
        }
        four.setOnClickListener {
            var text = four.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        five.setOnClickListener {
            var text = five.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        six.setOnClickListener {
            var text = six.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        seven.setOnClickListener {
            var text = seven.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        eight.setOnClickListener {
            var text = eight.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        nine.setOnClickListener {
            var text = nine.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        dot.setOnClickListener {
            var text = dot.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        percent.setOnClickListener {
            var text = percent.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        minus.setOnClickListener {
            var text = minus.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        plus.setOnClickListener {
            var text = plus.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        divide.setOnClickListener {
            var text = divide.text.toString()
            var exist = edits.text.toString()
            if(finals.text.toString().isBlank()){
                edits.text = exist+text
            }else{
                edits.text=""
                edits.text = finals.text.toString()+text
                finals.text = ""
            }
        }
        ac.setOnClickListener {
            edits.text = ""
            finals.text = ""
        }
        backSpace.setOnClickListener {
            var exist = edits.text.toString()
            if (exist.isNotEmpty()){
                var new = exist.dropLast(1)
                edits.text = new
            }else{
                Toast.makeText(applicationContext, "Can't delete more", Toast.LENGTH_SHORT).show()
            }
        }

        equal.setOnClickListener {
            var exist = edits.text.toString()

            if (exist.isBlank()) return@setOnClickListener

            val listOfNumbers = exist.split("((?<=[+\\-/()%x])|(?=[+\\-/()%x]))".toRegex())

            Log.d("mainActivity", listOfNumbers.toString())

            var num: Double = 0.0
            listOfNumbers.forEachIndexed { index, items ->
                when(index){
                    0 ->{
                        num = items.trim().toDouble()
                    }
                }
                when(items){
                    "x" -> {num *= listOfNumbers[index+1].trim().toDouble()}
                    "+" -> {num += listOfNumbers[index+1].trim().toDouble()}
                    "-" -> {num -= listOfNumbers[index+1].trim().toDouble()}
                    "/" -> {num /= listOfNumbers[index+1].trim().toDouble()}
                    "%" -> {
                        num *= listOfNumbers[index+1].trim().toDouble()
                        num*=100
                    }
                }
            }
            finals.text = num.toString()
        }
    }
}