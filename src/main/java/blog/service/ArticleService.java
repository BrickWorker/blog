package blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import blog.dao.ArticleRepository;

@Service
@Transactional
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;
	
	
}
