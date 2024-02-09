package com.myblog.Myblog11.controller;

import com.myblog.Myblog11.payload.PostDto;
import com.myblog.Myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class postController {
 private final PostService postService;

 public postController(PostService postService) {
  this.postService = postService;
 }
@PostMapping
 public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto){
  PostDto post = postService.createPost(postDto);
  return new ResponseEntity<>(post, HttpStatus.CREATED);
 }

}
