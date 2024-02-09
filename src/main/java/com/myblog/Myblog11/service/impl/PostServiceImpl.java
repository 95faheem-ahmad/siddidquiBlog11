package com.myblog.Myblog11.service.impl;

import com.myblog.Myblog11.entity.Post;
import com.myblog.Myblog11.payload.PostDto;
import com.myblog.Myblog11.repository.PostRepository;
import com.myblog.Myblog11.service.PostService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
@Service
public class PostServiceImpl implements PostService {
  private  PostRepository postRepository;
       public PostServiceImpl(PostRepository postRepository) {

        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
     post.setTitle(postDto.getTitle());
     post.setDescription(postDto.getDescription());
     post.setContent(postDto.getContent());
     Post savePost=postRepository.save(post);
     PostDto dto=new PostDto();
     dto.setTitle(savePost.getTitle());
     dto.setDescription(savePost.getDescription());
     dto.setContent(savePost.getContent());
     return dto;
    }
}
