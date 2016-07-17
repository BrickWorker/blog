package blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import blog.dao.ArticleTypeRepository;
import blog.model.ArticleType;

@Service
@Transactional
public class ArticleTypeService {
	
	@Autowired
	private ArticleTypeRepository articleTypeRepository;
	
	public ArticleType save(ArticleType articleType){
		return this.articleTypeRepository.save(articleType);
	}

}
