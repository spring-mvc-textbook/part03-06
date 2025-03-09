package com.example.spring.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostDao postDao;

    // 게시글 등록
    public boolean create(PostDto postDto) {
        int result = postDao.create(postDto);
        return result > 0;
    }
}
