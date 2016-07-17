package blog.dao;

import org.springframework.data.repository.CrudRepository;

import blog.model.Article;
import blog.model.ArticleType;

public interface ArticleTypeRepository extends CrudRepository<ArticleType, Long> {

}
