package com.andgur77.my_movie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
            button2.setOnClickListener {
                Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                button3.setOnClickListener {
                    Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                    button4.setOnClickListener {
                        Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
                        button5.setOnClickListener {
                            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                        }
                    }

                }
            }
        }
    }
}