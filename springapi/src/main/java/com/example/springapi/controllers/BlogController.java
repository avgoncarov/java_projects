package com.example.springapi.controllers;

import com.example.springapi.entities.Post;
import com.example.springapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/")
    public String index(){

        return "index";
    }

    @GetMapping(value = "/posts")
    public List<Post> posts(){

        return postService.getAllPosts();
    }
    @PostMapping(value = "/posts")
    public void publishPost(@RequestBody Post post){
        postService.insert(post);

    }
}
