package com.example;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private List<Article> articles = new ArrayList<>();

    public void addArticle(Article article) {
        articles.add(article);
    }

    public List<Article> getAllArticles() {
        return articles;
    }

    public Article getArticleByTitle(String title) {
        return articles.stream()
                .filter(article -> article.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }
}
