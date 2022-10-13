package com.emily.SpringIV.service;

import com.emily.SpringIV.model.Blog;
import com.emily.SpringIV.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private BlogRepo repo;

    @Override
    public List<Blog> getAllBlog() {
        return repo.getAll();
    }

    @Override
    public void save(Blog blog) {
        repo.saveBlog(blog);
    }
}
