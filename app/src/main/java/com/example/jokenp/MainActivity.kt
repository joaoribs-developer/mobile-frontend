package com.example.jokenp

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var  escolhaUser = ""

   var result =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pedra2 = findViewById<ImageView>(R.id.pedra).setOnClickListener {
            escolhaUser = "pedra"
            machineChange()

        }
        var papel2 = findViewById<ImageView>(R.id.papel).setOnClickListener {
            escolhaUser = "papel"
            machineChange()
            }
        var tesoura2 = findViewById<ImageView>(R.id.tesoura).setOnClickListener {
            escolhaUser= "tesoura"
            machineChange()
            }


    }



    fun machineChange(){
        var pedra = R.drawable.pedra
        var papel = R.drawable.papel
        var tesoura = R.drawable.tesoura
        val listImage: List<Int> = listOf(pedra, papel, tesoura)
        val escolhaMoment = listImage.random()
        var maquina = findViewById<ImageView>(R.id.maquina)
        maquina.setImageResource(escolhaMoment)

        when{
            escolhaUser == "tesoura" && escolhaMoment == 2131165340-> result = "A máquina venceu"
            escolhaUser == "pedra" && escolhaMoment == 2131165339-> result = "A máquina venceu"
            escolhaUser == "papel" && escolhaMoment == 2131165341-> result = "A máquina venceu"
            escolhaUser == "papel" && escolhaMoment == 2131165340-> result = "Você venceu!!"
            escolhaUser == "tesoura" && escolhaMoment == 2131165339-> result = "Você venceu!!"
            escolhaUser == "pedra" && escolhaMoment == 2131165341-> result = "Você venceu!!"
            else-> result = "Empate"
        }

        var textView = findViewById<TextView>(R.id.textView2).setText(result)


    }



    }




