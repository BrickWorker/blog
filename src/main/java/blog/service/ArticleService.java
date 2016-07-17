package blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import blog.dao.ArticleRepository;
import blog.model.Article;

@Service
@Transactional
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public Article save (Article article){
		return this.articleRepository.save(article);
	}
	
	
}
