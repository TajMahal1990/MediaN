package ru.netology.homework_androidstudio.repository

import androidx.lifecycle.LiveData
import ru.netology.homework_androidstudio.Post

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun likeById(id: Long)
    fun repostById(id: Long)
}