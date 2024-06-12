package com.example;

import java.time.LocalDate;

public class Article {
    private String title;
    private String content;
    private LocalDate publicationDate;

    public Article(String title, String content, LocalDate publicationDate) {
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }
}
