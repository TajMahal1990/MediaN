package ru.netology.homework_androidstudio

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import ru.netology.homework_androidstudio.adapter.PostsAdapter
import ru.netology.homework_androidstudio.databinding.ActivityMainBinding
import ru.netology.homework_androidstudio.viewmodel.PostViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel: PostViewModel by viewModels()

        val adapter = PostsAdapter({
            viewModel.likeById(it.id)
        },
            {
                viewModel.repostById(it.id)
            })
        binding.container.adapter = adapter

        viewModel.data.observe(this) { posts ->
            adapter.submitList(posts)
        }

    }
}