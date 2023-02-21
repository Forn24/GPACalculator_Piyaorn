package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Context
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Ok.setOnClickListener {
            var sub1 = s1.text.toString()
            var sub2 = s2.text.toString()
            var sub3 = s3.text.toString()
            var sub4 = s4.text.toString()
            var sub5 = s5.text.toString()
            var cre1 = c1.text.toString()
            var cre2 = c2.text.toString()
            var cre3 = c3.text.toString()
            var cre4 = c4.text.toString()
            var cre5 = c5.text.toString()
            var pt1 = po1.text.toString()
            var pt2 = po2.text.toString()
            var pt3 = po3.text.toString()
            var pt4 = po4.text.toString()
            var pt5 = po5.text.toString()
            if (sub1 == "" || sub2 == "" || sub3 == "" || sub4 == "" || sub5 == "" ||
                cre1 == "" || cre2 == "" || cre3 == "" || cre4 == "" || cre5 == "" ||
                pt1 == "" || pt2 == "" || pt3 == "" || pt4 == "" || pt5 == "" ) {
                toast {
                    "Please Input All Text Box Before Press OK !!!"
                }
            }
            else if (cre1 == "1" || cre1 == "2" || cre1 == "3") {
                if(cre2 == "1" || cre2 == "2" || cre2 == "3"){
                    if(cre3 == "1" || cre3 == "2" || cre3 == "3"){
                        if(cre4 == "1" || cre4 == "2" || cre4 == "3"){
                            if(cre5 == "1" || cre5 == "2" || cre5 == "3"){
                                var sum1 = pt1.toDouble() * cre1.toDouble()
                                var sum2 = pt2.toDouble() * cre2.toDouble()
                                var sum3 = pt3.toDouble() * cre3.toDouble()
                                var sum4 = pt4.toDouble() * cre4.toDouble()
                                var sum5 = pt5.toDouble() * cre5.toDouble()
                                var totalcre = cre1.toInt() + cre2.toInt() + cre3.toInt() + cre4.toInt() + cre5.toInt()
                                var totalpt = sum1 + sum2 + sum3 + sum4 + sum5
                                var gpa = totalpt / totalcre.toDouble()
                                var sum = "%.2f".format(gpa)
                                totalp.setText(totalcre.toString())
                                Gade.setText(sum.toString())
                            }
                        }
                    }
                }
            }
        }
    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message(), Toast.LENGTH_LONG).show()
}