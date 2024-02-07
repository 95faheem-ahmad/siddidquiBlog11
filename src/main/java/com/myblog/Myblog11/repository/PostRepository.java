package com.myblog.Myblog11.repository;

import com.myblog.Myblog11.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Long, Post> {

}
