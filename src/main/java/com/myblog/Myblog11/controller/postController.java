package com.myblog.Myblog11.controller;

import com.myblog.Myblog11.payload.PostDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class postController {
 public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto){


 }

}
