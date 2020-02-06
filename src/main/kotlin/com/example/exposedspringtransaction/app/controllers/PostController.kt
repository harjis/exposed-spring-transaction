package com.example.exposedspringtransaction.app.controllers

import com.example.exposedspringtransaction.app.models.Post
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts")
class PostController {
    @GetMapping
    @Transactional
    fun index(): List<PostView> = Post.all().map { PostView(it.name) }
}

data class PostView(val name: String)
