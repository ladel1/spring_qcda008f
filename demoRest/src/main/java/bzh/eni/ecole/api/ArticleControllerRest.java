package bzh.eni.ecole.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.eni.ecole.bo.Article;
import bzh.eni.ecole.service.ArticleService;

@RestController
@RequestMapping("/articles")
public class ArticleControllerRest {

	@Autowired private ArticleService articleService;
	
	@GetMapping
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public List<Article> allArticles(){
		return articleService.getAllArticles();
	}
	
	@GetMapping("/{id:[0-9]+}")
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public Article getArticle(@PathVariable Integer id){		
		return articleService.getArticleById(id);
	}
	
	@PostMapping
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public ResponseEntity<Article> addArticle(@RequestBody Article article){				
		articleService.saveArticle(article);
		return ResponseEntity.created(null).body(article);
	}
	@PutMapping("/{id:[0-9]+}")
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public ResponseEntity<Article> updateArticle(@PathVariable Integer id,
			                     @RequestBody Article article){	
		article.setId(id);
		articleService.saveArticle(article);
		return ResponseEntity.accepted().body(article);
	}
	
	@DeleteMapping("/{id:[0-9]+}")
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public ResponseEntity<String> deleteArticle(@PathVariable Integer id){				
		articleService.deleteArticle(id);//204
		return ResponseEntity.noContent().build();
	}
	
	
	
	
}
