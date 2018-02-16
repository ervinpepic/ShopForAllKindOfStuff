package com.example.ervinpepic.shopsforallkindofstuff.Services

import com.example.ervinpepic.shopsforallkindofstuff.Model.Category
import com.example.ervinpepic.shopsforallkindofstuff.Model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$21", "hat1"),
            Product("Devslopes Hat Black", "$13", "hat2"),
            Product("Devslopes Hat White", "$11", "hat3"),
            Product("Devslopes Snapback", "$32", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$34", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$21", "hoodie3"),
            Product("Devslopes Black Hoodie", "$35", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$21", "shirt1"),
            Product("Devslopes Shirt Light Gray", "$22", "shirt2"),
            Product("Devslopes Shirt Red", "$21", "shirt3"),
            Product("Devslopes Hustle", "$21", "shirt4"),
            Product("Kickflip Studios", "$11", "shirt5")

    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}