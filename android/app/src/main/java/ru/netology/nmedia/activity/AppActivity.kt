package ru.netology.nmedia.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R
import ru.netology.nmedia.adapter.PostsAdapter
import ru.netology.nmedia.databinding.ActivityAppBinding
import ru.netology.nmedia.viewmodel.PostViewModel

class AppActivity : AppCompatActivity(R.layout.activity_app) {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val viewModel: PostViewModel by viewModels()

        val binding = ActivityAppBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val adapter = PostsAdapter()
        binding.list.adapter = adapter

        viewModel.data.observe(this) { state ->
            adapter.submitList(state.posts)
        }
    }
}