package com.example.firstproject.repository;

import com.example.firstproject.controller.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {//<엔티티 타입, 기본키 타입>
    @Override
    ArrayList<Article> findAll();
}
