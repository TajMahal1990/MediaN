package ru.netology.homework_androidstudio

data class Post(
    val id : Long,
    val author: String,
    val content: String,
    val published: String,
    val likes: Long,
    val reposts: Long,
    val views: Long,
    val likedByMe: Boolean = false
)


