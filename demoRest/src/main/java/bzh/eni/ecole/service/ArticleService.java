package bzh.eni.ecole.service;

import java.util.List;

import bzh.eni.ecole.bo.Article;

public interface ArticleService {
	Article getArticleById(Integer id);
	List<Article> getAllArticles();
	void saveArticle(Article article);
}
