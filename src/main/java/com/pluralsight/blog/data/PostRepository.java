package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
//    public List<Post> findAll() {
//        return new ArrayList<>();
//    }
//
//    public List<Post> saveAll(List<Post> posts) {
//        return new ArrayList<>();
//    }
//
//    public Post save(Post post) {
//        return null;
//    }
//
//    public Optional<Post> findById(Long id) {
//        return null;
//    }
    @RestResource(rel = "contains-title", path = "containsTitle")
    List<Post> findByTitleContaining(String title);

    List<Post> findByAuthor_Lastname(String lastname);
}