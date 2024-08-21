package com.devdmp.pokedog

data class Dog (
    val id: Int,
    val index: Int = 0,
    val name: String = "",
    val type: String = "",
    val heightFemale: Double = 0.0,
    val heightMale: Double = 0.0,
    val imageUrl: String = "",
    val lifeExpectancy: String = "",
    val temperament: String = "",
    val weightFemale: Double = 0.0,
    val weightMale: Double = 0.0
)