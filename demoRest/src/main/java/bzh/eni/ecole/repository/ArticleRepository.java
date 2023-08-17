package bzh.eni.ecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bzh.eni.ecole.bo.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
