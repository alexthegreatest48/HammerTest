package ru.netology.nmedia.service

import com.github.javafaker.Faker
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import ru.netology.nmedia.dto.Post

@Service
class ScheduledPostGeneratorService(
    private val postService: PostService,
) {
}