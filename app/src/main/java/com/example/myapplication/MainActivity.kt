package com.example.myapplication

import android.app.ListActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import android.widget.ArrayAdapter





class MainActivity : ListActivity() {
    private val catNames = arrayOf(
        "Васька", "Барсик", "Мурзик",
        "Рыжик", "Дорофей", "Маркиз",
        "Васька", "Барсик", "Мурзик",
        "Рыжик", "Дорофей", "Маркиз",
        "Васька", "Барсик", "Мурзик",
        "Рыжик", "Дорофей", "Маркиз"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, catNames
        )
        val controller: LayoutAnimationController = AnimationUtils
            .loadLayoutAnimation(this, R.anim.list_layout_controller)
        listView.layoutAnimation = controller
    }
}