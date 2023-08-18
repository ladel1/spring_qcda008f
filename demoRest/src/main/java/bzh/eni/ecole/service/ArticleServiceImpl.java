package bzh.eni.ecole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bzh.eni.ecole.bo.Article;
import bzh.eni.ecole.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired private ArticleRepository articleRepo;

	@Override
	public Article getArticleById(Integer id) {
		return articleRepo.findById(id).get();
	}

	@Override
	public List<Article> getAllArticles() {		
		return articleRepo.findAll();
	}
	@Override
	public void saveArticle(Article article) {		
		articleRepo.save(article);
	}

	@Override
	public void updateArticle(Article article) {
		articleRepo.save(article);
		
	}

	@Override
	public void deleteArticle(Integer id) {
		articleRepo.deleteById(id);
	}

}
