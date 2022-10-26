package com.emily.aula.repository;

import com.emily.aula.model.Article;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ArticleRepo extends ElasticsearchRepository<Article, Integer> {
    @Query("{\"match_all\": {}}")
    List<Article> findAll();
}
