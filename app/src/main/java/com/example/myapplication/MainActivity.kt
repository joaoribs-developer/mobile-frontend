package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById<Button>(R.id.button)
        button.setOnClickListener {this
            val listFrases: List<String> = listOf("Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
                "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
                "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.")
            var textView = findViewById<TextView>(R.id.textView2)
            textView.setText(listFrases.random())
        }
3


    }
}






