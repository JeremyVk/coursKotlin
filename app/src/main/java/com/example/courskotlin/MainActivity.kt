package com.example.courskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class User(
    val name: String,
    val age: Int,
    val height: Float
) {

    private val canPlayBasketball = age > 5 && height > 1.5f;

    init {
        val basketString = when(canPlayBasketball) {
            true -> "bienvenue au club"
            false -> "degage sale nain"
        }
        println("info: ${name}, age ${age} ans, ${basketString}")
    }

    constructor(name: String): this(name, 6, 2f)
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jeremy = User("Jérémy", 28, 1.79f)
        val petitJeremy = User("JérémyNain", 28, 0.79f)
    }
}