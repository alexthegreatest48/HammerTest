package ru.netology.nmedia.dto

data class Post(
    val id: Long,
    var name: String,
    var photo: String,
    var ingridients: String,
    var price: Int = 0
)

