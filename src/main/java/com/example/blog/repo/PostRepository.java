package com.example.blog.repo;


import com.example.blog.models.Post;
import org.springframework.data.repository.CrudRepository; //позволяет работать с табличками

public interface PostRepository extends CrudRepository<Post, Long> {
}
