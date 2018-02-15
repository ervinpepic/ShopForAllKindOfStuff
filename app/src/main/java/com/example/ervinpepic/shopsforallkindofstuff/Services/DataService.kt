package com.example.ervinpepic.shopsforallkindofstuff.Services

import com.example.ervinpepic.shopsforallkindofstuff.Model.Category
import com.example.ervinpepic.shopsforallkindofstuff.Model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "ditigalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$21", "hat01"),
            Product("Devslopes Hat Black", "$13", "hat02"),
            Product("Devslopes Hat White", "$11", "hat03"),
            Product("Devslopes Snapback", "$32", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$34", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$21", "hoodie03"),
            Product("Devslopes Black Hoodie", "$35", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$21", "shirt01"),
            Product("Devslopes Shirt Light Gray", "$22", "shirt02"),
            Product("Devslopes Shirt Red", "$21", "shirt03"),
            Product("Devslopes Hustle", "$21", "shirt04"),
            Product("Kickflip Studios", "$11", "shirt05")

    )
}