package com.myblog.Myblog11.controller;

import com.myblog.Myblog11.payload.PostDto;
import com.myblog.Myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class postController {
 private  PostService postService;

 public postController(PostService postService) {
  this.postService = postService;
 }
@PostMapping
 public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto){
  PostDto post = postService.createPost(postDto);
  return new ResponseEntity<>(post, HttpStatus.CREATED);
 }
 // http://localhost:8085/api/posts?id=1
 @GetMapping()
public ResponseEntity<PostDto>getPostId(@RequestParam long id)
{
 PostDto dto = postService.getPostById(id);

return new ResponseEntity<>(dto,HttpStatus.OK);
}
}
