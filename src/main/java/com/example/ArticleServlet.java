package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "ArticleServlet", urlPatterns = {"/list-articles", "/view-article", "/add-article"})
public class ArticleServlet extends HttpServlet {
    private ArticleRepository articleRepository = new ArticleRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/list-articles":
                listArticles(request, response);
                break;
            case "/view-article":
                viewArticle(request, response);
                break;
            default:
                listArticles(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        if ("/add-article".equals(action)) {
            addArticle(request, response);
        } else {
            listArticles(request, response);
        }
    }

    private void listArticles(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("articles", articleRepository.getAllArticles());
        request.getRequestDispatcher("list-articles.jsp").forward(request, response);
    }

    private void viewArticle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        Article article = articleRepository.getArticleByTitle(title);
        request.setAttribute("article", article);
        request.getRequestDispatcher("view-article.jsp").forward(request, response);
    }

    private void addArticle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Article newArticle = new Article(title, content, LocalDate.now());
        articleRepository.addArticle(newArticle);
        response.sendRedirect("list-articles");
    }
}
